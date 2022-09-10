class Solution {
    public boolean canJump(int[] arr) {
        if(arr.length==1) return true;
        int goal = arr.length-1;
        for(int i = arr.length-1;i>=0;i--){
            if(i+arr[i]>=goal) goal=i;
            // else return false;
        }
        if(goal == 0) return true;
        return false;
    }
}