class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int words_length = words[0].length();
        int length = words.length;
        // System.out.println(sb);
        for(int i=0;i<length;i++){
            if(map.containsKey(words[i])){
                int t = map.get(words[i]);
                t++;
                map.put(words[i],t);
            }
            else
                map.put(words[i],1);
        }
        // System.out.println(map);
        
        for(int i=0;i<=s.length()-words_length;i++){
            
            Map<String,Integer> copy = new HashMap<>(map);
            String str = s.substring(i,i+words_length); // s.substring(0,3) -- s.substring(1,4) -- s.substring(2,5)
             // System.out.println(str);
            if(copy.containsKey(str)){
                // System.out.println(i);
                int t = copy.get(str);
                if(--t==0) {
                    System.out.println("removed "+ str);
                    copy.remove(str);
                }
                
                else copy.put(str,t);
                if(copy.size()==0) list.add(i);
                int x = i+words_length;
                
                // System.out.println(copy);
                while(true && x+words_length<=s.length()){
                    String str1 = s.substring(x,x+words_length);
                    
                    // System.out.println(str1);
                    if(copy.containsKey(str1)){
                        int g = copy.get(str1);
                        if(--g==0) {
                            copy.remove(str1);
                            // System.out.println("removed " + str1);
                            // System.out.println(copy);
                        }
                        // g--;
                        else{
                            copy.put(str1,g);
                            // System.out.println(copy);
                        }
                        // if(x+words_length > s.length()) break; 
                        x = x+words_length;
                        if(copy.size()==0) list.add(i);
                    }
                    else{
                        break;
                    }
                }
                
                
            }
            // }
        }
        return list;
    }
}