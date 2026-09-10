class Solution {
    public int maxScore(String s) {
        int leftzero[]=new int[s.length()];
        int rightone[]=new int[s.length()];
        int czero=0,c_one=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                czero+=1;
                leftzero[i]=czero;
            } 
            else leftzero[i]=czero;
        }
         for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                c_one+=1;
                rightone[i]=c_one;
            } 
            else rightone[i]=c_one;
        }
        for(int i=0;i<s.length()-1;i++) max=Math.max(max,leftzero[i]+rightone[i+1]);
        return max;
    }
}
