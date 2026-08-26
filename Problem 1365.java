class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i); 
            }
        } 
       for(int i=0;i<arr.length;i++){
         arr[i]=map.get(nums[i]);
       }
       return arr;
    }
}
