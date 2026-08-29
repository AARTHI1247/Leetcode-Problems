class Solution {
    public int largestInteger(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                if(set.add(nums[j])){
                if(!map.containsKey(nums[j])) map.put(nums[j],1);
                else map.put(nums[j],map.get(nums[j])+1);
                }
            }
        }
        int max=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue().equals(1)){
                int val=e.getKey();
                if(max<val) max=val;
            } 
            }
        return max;
    }
}
