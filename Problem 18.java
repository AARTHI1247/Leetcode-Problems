class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> array=new ArrayList<>();
      int i=0,j=1,left=2,right=nums.length-1;
      Arrays.sort(nums);
      while(i<nums.length-3){
        while(j<nums.length-2){
            while(left<right){
                long summation=(long)nums[i] + nums[j] + nums[left] + nums[right];
                if(summation == target){
                    ArrayList<Integer> sum=new ArrayList<>();
                    sum.add(nums[i]);
                    sum.add(nums[j]);
                    sum.add(nums[left]);
                    sum.add(nums[right]);
                    array.add(sum);
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left]) left++;
                    while(left<right && nums[right+1]==nums[right]) right--;
                }
                else if(summation < target) left++;
                else if(summation > target) right--;
            }
            j++;
            while(j<nums.length-2 && nums[j]==nums[j-1]) j++;
            left=j+1;
            right=nums.length-1;
        }
         i++;
            while(i<nums.length-3 && nums[i]==nums[i-1]) i++;
            j=i+1;
            left=j+1;
            right=nums.length-1;
      } 
      return array;
    }
}
