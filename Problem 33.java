class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ind=0,f=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ind=i;
                f=1;
                break;
            }
        }
        if(f==1){
        return ind;
        }
       
      return -1;
        
    }
}
