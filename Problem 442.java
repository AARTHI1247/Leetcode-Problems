class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
                int x=Math.abs(nums[i]);
                if(nums[x-1]>0) nums[x-1]=-1*nums[x-1];
                else list.add(x);
        }
        return list;
    }
}
