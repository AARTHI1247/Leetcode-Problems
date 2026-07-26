class Solution {
    public String addBinary(String a, String b) {
        int sum=0,c=0,i=a.length()-1,j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0){
            sum=c;
            if(i>=0){
        int n=a.charAt(i)-'0';
        sum=sum+n;
            }
            if(j>=0){
        int m=b.charAt(j)-'0';
        sum=sum+m;
            }
        sb.append(sum%2);
        c=sum/2;
        i--;
        j--;
        }
        if(c==1){
            sb.append(c);
        }
    return sb.reverse().toString();
    }
}
