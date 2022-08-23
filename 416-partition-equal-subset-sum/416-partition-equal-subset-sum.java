class Solution {
//     public int f(int ind, int arr[], int sum, int dp[][]){
//         if(sum==0){
//             return 1;
//         }
//         if(ind==0){
//             if(arr[ind]==sum){
//                 return 1;
//             }
//             return 0;
//         }
//         if(dp[ind][sum]!=-1) return dp[ind][sum];
//         int not_take = f(ind-1,arr,sum,dp);
//         int take = 0;
//         if(arr[ind]<=sum) take = f(ind-1,arr,sum-arr[ind],dp);
//         return dp[ind][sum] = not_take | take;
        
//     }
    public int f(int ind, int arr[], int sum, int dp[][]){
        if(sum==0) return 1;
        if(ind==0){
            if(arr[ind]==sum){
                return 1;
            }
            return 0;
        }
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        int not_take = f(ind-1,arr,sum,dp);
        int take = 0;
        if(sum>=arr[ind]) take = f(ind-1,arr,sum-arr[ind],dp);
        return dp[ind][sum] = take | not_take;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int[][] dp = new int[nums.length+1][sum];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        if(f(nums.length-1,nums,sum/2,dp)>=1) return true;
        else return false;
    }
}