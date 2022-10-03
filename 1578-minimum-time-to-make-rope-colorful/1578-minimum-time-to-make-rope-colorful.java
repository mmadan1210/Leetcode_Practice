class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i = 0;
        int j =0;
        int n = colors.length();
        int totaltime = 0;
        while(i<n && j<n){
            int ans = 0;
            int maxTime = 0;
            while(j<n && colors.charAt(i)==colors.charAt(j)){
                maxTime = Math.max(maxTime, neededTime[j]);
                ans+=neededTime[j];
                j++;
            }
            i=j;
            totaltime += (ans-maxTime);
        }
        return totaltime;
    }
}