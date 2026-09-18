class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0,pd=1,left=0;
        if (k <= 1) return 0;
        for(int i=0;i<nums.length;i++){
            pd*=nums[i];
            while (pd >= k) {
            pd /= nums[left];
            left++;
            }
            if(pd<k) count+=i - left + 1;
            }
        return count;
    }
}
