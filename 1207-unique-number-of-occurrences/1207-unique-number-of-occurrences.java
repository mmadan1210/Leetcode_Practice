class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Arrays.sort(arr);
        // Map<Integer,Integer> h = new HashMap<Integer,Integer>();
        // Set<Integer> h1 = new HashSet<Integer>();
        // for(int i=0;i<arr.length;i++){
        //     int count = 0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //         h.put(arr[i],count);
        //     }
        // }
        // Set entrySet = h.entrySet();
        // Iterator it = entrySet.iterator();
        // while(it.hasNext()){
        //     Map.Entry me = (Map.Entry)it.next();
        //     int t = (int) me.getValue();
        //     h1.add(t);
        // }
        // if(h1.size()==h.size()){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            int val = map.getOrDefault(i, 0);
            map.put(i, ++val);
        }
        
        List<Integer> list = new ArrayList<Integer>(map.values());
        Set<Integer> set = new HashSet(list);
        
        return list.size() == set.size();
    }
}