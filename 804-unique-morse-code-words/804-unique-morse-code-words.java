class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s: words){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                sb.append(arr[s.charAt(i)-'a']);
            }
            System.out.println(sb);
            set.add(String.valueOf(sb));
        }
        return set.size();
    }
}