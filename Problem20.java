class Solution {
    public boolean isValid(String s) {
        char ch=' '; 
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                
                if(s.charAt(i)==')'){
                    if(st.isEmpty()){
                        return false;
                    }
                    ch=st.pop();
                    if(ch!='('){
                        return false;
                    }     
                }
                else if(s.charAt(i)==']'){
                    if(st.isEmpty()){
                        return false;
                    }
                    ch=st.pop();
                   if(ch!='['){
                        return false;
                    }  
                }
               else if(s.charAt(i)=='}'){
                    if(st.isEmpty()){
                        return false;
                    }
                    ch=st.pop();
                   if(ch!='{'){
                        return false;
                    }  
                }
            }
        }
        return  st.isEmpty();
    }
}
