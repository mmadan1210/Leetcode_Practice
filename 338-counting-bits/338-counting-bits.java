class Solution {
    public int countSetBits(int x){
        int count = 0;
        while(x!=0){
            x = x & (x-1);
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = countSetBits(i);
        }
        return arr;
    }
}