class Solution {
    public int countSetBits(int n){
        int count = 0;
        while(n!=0){
            n = (n)&(n-1);
            count++;
        }
        return count;
    }
    public boolean isPrime(int x){
        if(x==1){
            return false;
        }
        if(x==2 || x==3){
            return true;
        }
        for(int i=2;i<=x/2;i++){
            if(x%i==0) return false;
        }
        return true;
        
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            if(isPrime(countSetBits(i))){
                count++;
            }
        }
        return count;
    }
}