class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                int ans=map.get(nums[i])-i;
                if(ans<=k) return true;
                else map.put(nums[i],i);
            }
        }
        return false;
    }
}
