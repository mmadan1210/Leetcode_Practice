class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        int[][] heights = new int[2*buildings.length][2];
        for(int i=0;i<buildings.length;i++){
            heights[2*i] = new int[]{buildings[i][0], -buildings[i][2]};
            heights[2*i+1] = new int[]{buildings[i][1], buildings[i][2]};
        }
        
        Arrays.sort(heights, (a,b)->(a[0]!=b[0])?(a[0]-b[0]):(a[1]-b[1]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        pq.add(0);
        int prevMax = 0;
        
        List<List<Integer>> res = new ArrayList<>();
        for(int[] height:heights){
            if(height[1]<0){
                pq.add(Math.abs(height[1]));
            }else{
                pq.remove(height[1]);
            }
            int curr = pq.peek();
            if(curr!=prevMax){
                res.add(List.of(height[0], curr));
                prevMax = curr;
            }
        }
        return res;
    }
}