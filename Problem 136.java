class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> fre=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(fre.containsKey(nums[i])){
             fre.put(nums[i],fre.get(nums[i])+1);
            }
            else{
                fre.put(nums[i],1);
            }
        }
       for(int x:nums){
        if(fre.get(x)==1) return x;
       }
       return -1;
    }
}
