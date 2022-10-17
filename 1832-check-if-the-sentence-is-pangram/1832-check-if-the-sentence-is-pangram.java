class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> map = new HashSet<>();
            for(int i=0;i<sentence.length();i++){
                map.add(sentence.charAt(i));
            }
        if(map.size()==26) return true;
        return false;
    }
}