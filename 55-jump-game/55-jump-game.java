class Solution {
    public boolean canJump(int[] arr) {
        
        int goal = arr.length-1;
        for(int i = arr.length-1;i>=0;i--){
            if(i+arr[i]>=goal) goal = i;
        }
        if(goal == 0) return true;
        return false;
    }
}