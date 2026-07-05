class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int sum=0,ans=nums[0]+nums[1]+nums[2],val=0;
        if(n==3){
           return sum=nums[0]+nums[1]+nums[2];
        }
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int left=0,right=0;
        for(int i=0;i<n-2;i++){
            left=i+1;
            right=n-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                val=Math.abs(sum-target);
                if(sum==target){
                    return sum;
                }
                if(val<min){
                    min=val;
                    ans=sum;
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
            }
        }
        return ans;
    }
}
