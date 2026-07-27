class Solution {
    public int evalRPN(String[] tokens) {
       int n1=0,n2=0,res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
             if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                n2=st.pop();
                n1=st.pop();
                if(tokens[i].equals("+")){
                    res=n1+n2;
                    st.push(res);
                }
                else if(tokens[i].equals("-")){
                    res=n1-n2;
                    st.push(res);
                }
                else if(tokens[i].equals("*")){
                    res=n1*n2;
                    st.push(res);
                }
                else if(tokens[i].equals("/")){
                    res=n1/n2;
                    st.push(res);
                }
            }
            else{
                int num=Integer.parseInt(tokens[i]);
                st.push(num);
            }
        }
        return st.pop();
    }
}
