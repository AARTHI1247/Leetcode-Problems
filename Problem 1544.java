class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!(st.isEmpty())&& (s.charAt(i)!=st.peek())){
                if(Character.toUpperCase(s.charAt(i))==Character.toUpperCase(st.peek())){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }
           
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append(st.get(i));
        }
        return sb.toString();
    }
}
