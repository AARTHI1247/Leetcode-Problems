class Solution {
    public String clearDigits(String s) {
     Stack<Character> st=new Stack<>();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
            st.push(s.charAt(i));
        }
        else if((s.charAt(i)>='0'||s.charAt(i)<='9') && !st.isEmpty()){
            st.pop();
        }
     }   
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<st.size();i++){
        sb.append(st.get(i));
    }
    String str=new String(sb);
    return str;
    }
}
