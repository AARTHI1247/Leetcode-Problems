class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        int ind=0,f=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                f=1;
                st.push(word.charAt(i));
                break;
                
            }
            else{
                st.push(word.charAt(i));
            }
        }
        if(f==0){
            return word;
        }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<=ind;i++){
                sb.append(st.pop());
            }
            for(int i=ind+1;i<word.length();i++){
                sb.append(word.charAt(i));
            }
            String str=new String(sb);
            return str;
    }
}
