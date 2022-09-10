class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's Algorithm
        // int maxSum=Integer.MIN_VALUE;
        // int curSum=0;
        // if(nums.length==1){
        //     return nums[0];
        // }
        // for(int i=0;i<nums.length;i++){
        //     curSum=curSum+nums[i];
        //     maxSum = Math.max(maxSum,curSum);
        //     if(curSum<0){
        //         curSum=0;
        //     }
        // }
        // return maxSum;
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum = Math.max(max_sum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max_sum;
    }
}