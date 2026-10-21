class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1,c=0;
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(s);
        int leftflag=0,rightflag=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                sb1.deleteCharAt(j);
                int left=0,right=sb1.length()-1;
                while(left<right){
                    if(sb1.charAt(left)!=sb1.charAt(right)){
                        rightflag=1;
                        break;
                    };
                    left++;
                    right--;
                }
                sb2.deleteCharAt(i);
                int l=0,r=sb2.length()-1;
                while(l<r){
                    if(sb2.charAt(l)!=sb2.charAt(r)){
                        leftflag=1;
                        break;
                    };
                    l++;
                    r--;
                }
                break;
            }
            i++;
            j--;
        }
        if((leftflag == 0 && rightflag==0)||(leftflag == 0 && rightflag==1)||(leftflag == 1 && rightflag==0))return true;
        return false;
    }
}
