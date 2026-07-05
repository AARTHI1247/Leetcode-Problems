class Solution {
    public boolean isMonotonic(int[] nums) {
        int in=0,dec=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                in=1;
            }
            if(nums[i]>nums[i+1]){
                dec=1;
            }
        }
        if(in==1 && dec==1){
            return false;
        }
        return true;
    }
}
