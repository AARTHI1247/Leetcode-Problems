class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)return 0;
        int i=0,j=k-1,min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        while(j<nums.length){
            int val=nums[j]-nums[i];
            min=Math.min(min,val);
            i++;
            j++;
        }
        return min; 
    }
}
