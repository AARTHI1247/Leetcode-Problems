class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length,c=1,k=0;
        if(n==1){
            return 1;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            else{
            if(c>=2){
                for(int j=0;j<2;j++){
                nums[k++]=nums[i];
                }
            }
            else if(c==1){
                nums[k++]=nums[i];
            }
            c=1;
        }
        }
          if(c>=2){
            for(int i=0;i<2;i++){
                nums[k++]=nums[n-1];
            }
          }
           else {
            nums[k++] = nums[n - 1];
}  
        return k;
    }
}
