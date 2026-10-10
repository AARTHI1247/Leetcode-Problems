class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int val=2*k;
        for(int i=0;i<s.length();i+=val){
            int temp1 = i;
            int temp2 = Math.min(i + k - 1, s.length() - 1); 
            while(temp1<temp2){
                char temp=s.charAt(temp1);
                sb.setCharAt(temp1,sb.charAt(temp2));
                sb.setCharAt(temp2,temp);
                temp1++;
                temp2--;
            }
        }
        return sb.toString();
    }
}   
