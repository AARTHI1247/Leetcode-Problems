class Solution {
    public String removeOuterParentheses(String s) {
        int depth=0;
        int i=0;
        String sb="";
        while(i<s.length()){
            if(s.charAt(i)=='('){
                depth++;
                if(depth!=1)sb=sb+s.charAt(i);
            } 
            else{depth--;
                if(depth!=0)sb+=s.charAt(i);}
            i++;
        }
        return sb;
    }
}
