class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int c=1,max=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).equals(arr.get(i-1)+1)){
                c++;
                if(max<c){
                    max=c;
                }
            }
            else{
                c=1;
            }
        }
        return max;
    }
}
