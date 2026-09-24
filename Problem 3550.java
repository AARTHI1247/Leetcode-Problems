class Solution {
    public int smallestIndex(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            arr[i]=sum;
        }
        for(int i=0;i<arr.length;i++) if(arr[i]==i) return arr[i];
        return -1;
    }
}
