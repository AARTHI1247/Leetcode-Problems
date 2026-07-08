class Solution {
    public int hIndex(int[] citations) {
        int j=1,c=0,val=0;
        int n=citations.length;
        Arrays.sort(citations);
        while(j<=n){
            c=0;
            for(int i=0;i<n;i++){
             if(j<=citations[i]){
                c++;
            } 
            } 
            if(j<=c){
                val=j;
            }  
            j++;
        }
        return val;
    }
}
