class Solution {

    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int c = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]) c++;
            else{
                list.add(c);
                c = 1;
            }
        }
        list.add(c);
        Collections.sort(list,Collections.reverseOrder());
        int sum = 0;
        int count = 1;
        for(int ele:list) {
            sum+=ele;
            if(sum>=arr.length/2){
                return count;
            }
            count++;
        }
        
        
        return 0;
    }
}