class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')) {   
            if((sb.charAt(j)>='a' && sb.charAt(j)<='z')||(sb.charAt(j)>='A' && sb.charAt(j)<='Z')){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            } 
            else j--;
            }
            else i++;
        }
        return sb.toString();

    }
}
