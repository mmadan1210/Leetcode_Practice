class Solution {
    public int f(int ind, int target, int coins[], int dp[][]){
        if(ind==0){
            if(target%coins[ind]==0) return 1;
            else return 0;
        }
        if(target==0){
            return 1;
        }
        if(dp[ind][target]!=-1) return dp[ind][target];
        int not_pick = f(ind-1,target,coins,dp);
        int pick = 0;
        if(coins[ind]<=target) pick = f(ind,target-coins[ind],coins,dp);
        
        return dp[ind][target] = pick+not_pick;
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount+1];
        for(int rows[] : dp){
            Arrays.fill(rows,-1);
        }
        return f(coins.length-1,amount,coins,dp);
    }
}