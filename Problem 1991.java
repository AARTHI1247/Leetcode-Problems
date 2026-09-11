class Solution {
    public int findMiddleIndex(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        if(nums.length==1) return 0;
        l[0]=nums[0];
        r[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++) l[i]=l[i-1]+nums[i];
        for(int i=nums.length-2;i>=0;i--) r[i]=r[i+1]+nums[i];
            if(r[1]==0) return 0;
        for(int i=1;i<nums.length-1;i++){
            if(l[i-1]==r[i+1]) return i;
        } 
        if(l[nums.length-2]==0) return nums.length-1;
        return -1;
    }
}
