class Solution {
    public int f(int ind, int arr[], int target, int dp[][]){
        
        if(ind==0){
            if(target%arr[ind]==0) return target/arr[ind];
            else return (int)Math.pow(10,9);
        }
        
        if(dp[ind][target]!=-1) return dp[ind][target];
        
        int not_pick = 0 + f(ind-1,arr,target,dp);
        
        int pick = Integer.MAX_VALUE;
        if(arr[ind]<=target)
            pick = 1 + f(ind,arr,target-arr[ind],dp);
            
        return dp[ind][target] = Math.min(not_pick,pick);
    }
    public int coinChange(int[] coins, int amount) {
        
        int dp[][] = new int[coins.length][amount+1];
        for(int rows[] : dp){
            Arrays.fill(rows,-1);
        }
        if(f(coins.length-1,coins,amount,dp)==(int)Math.pow(10,9)) return -1;
        return f(coins.length-1,coins,amount,dp);
    }
}