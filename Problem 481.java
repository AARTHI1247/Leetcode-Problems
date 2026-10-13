class Solution {
    public int magicalString(int n) {
        if(n<=2) return 1;
        int count=0;
        int arr[]=new int[n];
        arr[0]=1;
        arr[1]=2;
        arr[2]=2;
        int k=3,val=0,i=2;
        while(k!=n){
                if(arr[k-1]==1) val=2;
                if(arr[k-1]==2) val=1;
            if(arr[i]==2){
                for(int j=1;j<=2 && k!=n;j++){
                    arr[k]=val;
                    k++;
                }
            }
            else{
                arr[k]=val;
                k++;
            }
            i++;
        }
        for(int j=0;j<n;j++) if(arr[j]==1) count++;
        return count;
    }
} 
