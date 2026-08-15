class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++) set.add(nums1[i]);
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]) && !arr.contains(nums2[i])) arr.add(nums2[i]);}
        int array[]=arr.stream().mapToInt(x->x).toArray();
        return array;
    }
}
