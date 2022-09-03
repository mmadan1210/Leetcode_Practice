class Solution {
    Set<Integer> set = new HashSet<>();
    public void f(int num, int digit, int k, int n){
        if(digit>9 || digit<0){
            return;
        }
        if(n==0){
            set.add(num);
            return;
        }
        num = num*10+digit;
        f(num,digit+k,k,n-1);
        f(num,digit-k,k,n-1);
        
    }
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<=9;i++){
            f(0,i,k,n);
        }
        int[] ans = new int[set.size()];
    
        int count=0;
        for(int i : set){
            ans[count]=i;
            count++;
        }
        
        return ans;
    }
}