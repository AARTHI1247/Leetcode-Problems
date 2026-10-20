class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int j=nums.length-1;
        int i=0;
        while(i<j){
        if(-1*nums[i]==nums[j]) return nums[j];
        else if(-1*nums[i]<nums[j]) j--;
        else if(-1*nums[i]>nums[j]) i++;
        }
        return -1;
    }
}
