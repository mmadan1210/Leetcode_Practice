class Solution {
    public String reverseWords(String s) {
        String st[] = s.split(" ");
        StringBuffer main = new StringBuffer();
        for(int i=0;i<st.length;i++){
            StringBuffer sb = new StringBuffer();
            sb.append(st[i]);
            sb.reverse();
            main.append(sb);
            if(i<st.length-1)
                main.append(" ");
        }
        String val = main.toString();
        return val;
    }
}