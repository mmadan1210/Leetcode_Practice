class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> flist = new ArrayList<>();
	    Arrays.sort(words);
        int[] freq = new int[words.length+1];
        // int[] max = new int[words.length+1];
        int left = 0;
        int right = 0;
        int count = 0;
        int maxx = 0;
        while(right!=words.length){
            if(words[left].equals(words[right])){
                count++;
                right++;
            }
            else{
                freq[left]=count;
                maxx = count;
                count=0;
                left=right;
            }
        }
        freq[left] = count;
        // System.out.println(count);
        int max = 0;
        int ind = 0;
        while(k!=0){
            for(int i=0;i<freq.length;i++){
                if(max<freq[i]){
                    ind = i;
                    max = freq[i];
                }
            }
        flist.add(words[ind]);
        freq[ind]=0;
        max =0;
        ind = 0;
        k--;
        }
        return flist;
    }
}