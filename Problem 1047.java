class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
        if(st.isEmpty()||st.peek()!=s.charAt(i)){
            st.push(s.charAt(i));
        }
        else{
            st.pop();
        }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<st.size();i++){
            str.append(st.get(i));
        }
        return str.toString();
    }
}
