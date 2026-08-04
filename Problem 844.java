class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>tt=new Stack<>();
            for(int i=0;i<s.length();i++){
                if(!(st.isEmpty())&&(s.charAt(i)=='#')){
                    st.pop();
                }
                else if((st.isEmpty())&&(s.charAt(i)=='#')){
                    continue;
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            for(int i=0;i<t.length();i++){
                if(!(tt.isEmpty())&&(t.charAt(i)=='#')){
                    tt.pop();
                }
                else if((tt.isEmpty())&&(t.charAt(i)=='#')){
                    continue;
                }
                else{
                   tt.push(t.charAt(i));
                }
            }
       if(st.equals(tt)){
        return true;
       }
        return false;
    }
}
