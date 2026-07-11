class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int sum=0,i=0,j=0;
         while(i<n-1){
            if(prices[i]>=prices[i+1]){
                i++;
            }
            else{
                j=i;
                while(j<n-1 &&prices[j]<=prices[j+1]){
                   j++;
                }
                 sum=sum+(prices[j]-prices[i]);
                 i=j+1;
                }
            }
         return sum;                                                     
    }
}
