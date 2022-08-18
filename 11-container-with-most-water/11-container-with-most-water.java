class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = height.length-1;
        int max = Integer.MIN_VALUE;
        while(l<r){
            max = Math.max(max,Math.min(height[l],height[r])*(n-1));
            if(height[l]>=height[r]){
                r--;
            }
            else{
                l++;
            }
            n--;
        }
        return max;
    }
}