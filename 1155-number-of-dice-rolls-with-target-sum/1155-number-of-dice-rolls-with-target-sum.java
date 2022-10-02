class Solution {
    int mod = 1000000007;
    public int f(int dices, int faces, int target, int dp[][]){
        if(target<0) return 0;
        if(target==0 && dices!=0) return 0;
        if(dices==0 && target!=0) return 0;
        if(dices==0 && target==0) return 1;
        
        
        if(dp[dices][target]!=-1){
            return dp[dices][target]%mod;
        }
        int ans = 0;

        for(int i=1;i<=faces;i++){
            ans = ans + f(dices-1,faces,target-i,dp);
            ans %= mod;
        }
        return dp[dices][target] = ans;
        
    }
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][] = new int[n+1][target+1];
        for(int rows[]: dp){
            Arrays.fill(rows,-1);
        }
        return f(n,k,target,dp)%mod;
    }
}