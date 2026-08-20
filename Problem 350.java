class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(i,nums1[i]);
        }
            for(int i=0;i<nums2.length;i++){
            Iterator<Map.Entry<Integer,Integer>>it=map.entrySet().iterator();
                while(it.hasNext()){        
                    Map.Entry<Integer,Integer>en=it.next();
                    if(en.getValue().equals(nums2[i])){
                     it.remove();
                    arr.add(nums2[i]);
                    break;
                    }
                }
            }
       int array[]=arr.stream().mapToInt(x->x).toArray();
       return array;
    
}
}
