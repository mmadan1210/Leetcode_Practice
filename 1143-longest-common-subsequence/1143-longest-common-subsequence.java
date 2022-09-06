class Solution {
    public int f(int ind1,int ind2, String s1, String s2, int dp[][]){
        if(ind1<0 || ind2<0) return 0;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2)){
            return 1 + f(ind1-1,ind2-1,s1,s2,dp);
        }
        return dp[ind1][ind2] = 0 + Math.max(f(ind1,ind2-1,s1,s2,dp),f(ind1-1,ind2,s1,s2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return f(text1.length()-1,text2.length()-1,text1,text2,dp);
    }
}