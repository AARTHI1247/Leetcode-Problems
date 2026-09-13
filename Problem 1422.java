class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int leftzero[]=new int[n];
        int rightone[]=new int[n];
        if(s.charAt(0)=='0') leftzero[0]=1;
        if(s.charAt(n-1)=='1') rightone[n-1]=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='0') leftzero[i]=leftzero[i-1]+1;
            else leftzero[i]=leftzero[i-1];
        }
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='1') rightone[i]=rightone[i+1]+1;
            else rightone[i]=rightone[i+1];
        }
        int sum=0,max=0;
        for(int i=0;i<n;i++) {
            sum=0;
            if(i==n-1) sum+=leftzero[i-1]+rightone[i];
            else sum+=leftzero[i]+rightone[i+1];
            max=Math.max(sum,max);
        }
        return max;
    }
}
