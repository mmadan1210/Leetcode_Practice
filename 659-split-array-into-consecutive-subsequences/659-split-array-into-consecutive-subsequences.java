class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           frequency.put(nums[i], frequency.getOrDefault(nums[i], 0)+1);
       }
        Map<Integer, Integer> vacancy = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(frequency.get(nums[i])<=0)continue;
             else if(vacancy.getOrDefault(nums[i], 0)>0){
                 frequency.put(nums[i], frequency.getOrDefault(nums[i], 0)-1);
                 vacancy.put(nums[i], vacancy.getOrDefault(nums[i], 0)-1);
                 vacancy.put(nums[i]+1, vacancy.getOrDefault(nums[i]+1, 0)+1);
             }
            else if(frequency.getOrDefault(nums[i], 0)>0 && frequency.getOrDefault(nums[i]+1, 0)>0 &&            frequency.getOrDefault(nums[i]+2, 0)>0){
                frequency.put(nums[i], frequency.getOrDefault(nums[i], 0)-1);
                frequency.put(nums[i]+1, frequency.getOrDefault(nums[i]+1, 0)-1);
                frequency.put(nums[i]+2, frequency.getOrDefault(nums[i]+2, 0)-1);
                vacancy.put(nums[i]+3, vacancy.getOrDefault(nums[i]+3, 0)+1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}