class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pd=1,temp=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            pd*=d;
            n/=10;
        }
        if(temp%(sum+pd)==0) return true;
        return false;
    }
}
