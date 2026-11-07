class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        int i=0,left=0,right=nums.length-1;
        while(i<nums.length && left<=right){
            if(nums[i]%2==0){
                 arr[left]=nums[i];
                 i++;
                 left++;
            }
            else{
                arr[right]=nums[i];
                i++;
                right--;
            }
        }
        return arr;
    }
}
