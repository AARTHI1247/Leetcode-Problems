class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<s.length()){
            if(j<spaces.length && i==spaces[j]){
                sb.append(" ");
                sb.append(s.charAt(i));
                j++;
                i++;
            } 
            else{
             sb.append(s.charAt(i));
             i++;}
        }
        return sb.toString();
    }
}
