class Solution {
    public int numberOfWeakCharacters(int[][] p) {
        Arrays.sort(p,(a,b)-> a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        // System.out.println(Arrays.deepToString(p));
       int max = -1,res = 0;
        for(int[] t: p){
            if(t[1] < max) res++;
            else max = t[1];
        }
        return res;
    }
}