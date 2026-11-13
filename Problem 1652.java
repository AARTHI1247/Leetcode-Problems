class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[code.length];
        if(k==0)return arr;
        int sum=0;
        for(int i=0;i<code.length;i++){
        if(k>0){
            int l=0;
            for(int j=1;j<=k;j++){
                if(i+j>=code.length){
                    sum+=code[l];
                    l++;
                }
                else sum+=code[i+j];
            }
        }
        else if (k<0){
            int l=code.length-1;
            for(int j=1;j<=-k;j++){
                if(i-j<0){
                    sum+=code[l];
                    l--;
                }
                else sum+=code[i-j];
            }
        }
        arr[i]=sum;
        sum=0;
        }
        return arr;
    }
}
