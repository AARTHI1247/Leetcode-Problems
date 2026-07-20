class Solution {
    public String smallestSubsequence(String s) {
         StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int[] ind=new int[26];
        for(int i=0;i<s.length();i++){
            ind[s.charAt(i)-'a']=i;
        }
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.contains(s.charAt(i))){
                continue;
            } 
            while(!st.isEmpty() && st.peek()>s.charAt(i) && ind[st.peek()-'a']>i){
                st.pop();
            }
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}
