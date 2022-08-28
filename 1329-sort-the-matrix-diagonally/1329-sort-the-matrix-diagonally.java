class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer,PriorityQueue<Integer>> hm = new HashMap<>();
        int n = mat.length,m = mat[0].length;
        // fill the priority queue
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                PriorityQueue<Integer> pq = hm.getOrDefault(i-j,new PriorityQueue<>());
                pq.add(mat[i][j]);
                hm.put(i-j,pq);
            }
        }
        // update the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = hm.get(i-j).poll();
                
            }
        }
        
        return mat;
    }
}