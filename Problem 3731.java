class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>arr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        int i=min;
        while(i<max){
            if(!set.contains(i)) arr.add(i);
            i++;
        }
        return arr;
    }
}
