class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        
        Stack<Integer> q = new Stack<>();
        
        for(int i=0;i<s.length();i++){ 
            if(q.isEmpty()==false && q.peek()<map.get(s.charAt(i))){
                q.push(map.get(s.charAt(i))-q.pop());
                // q.add(t);
            }
            else if(q.isEmpty()==true || q.isEmpty()==false && q.peek()>=map.get(s.charAt(i))){
                q.push(map.get(s.charAt(i)));
            }
            
        }
        System.out.println(q);
        while(q.isEmpty()==false){
            ans+=q.pop();
        }
        return ans;
    }
}