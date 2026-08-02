class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ind=1,i=0,f=0;
        while(i!=n){
            if(ind==nums[i]){
                f=1;
                i++;
                ind++;
            }
            else if(nums[i]<ind){
                i++;
            }
            else if(nums[i]>ind){
                return ind;
            }
        }
        return ind;
    }
}
