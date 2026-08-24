class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> list=new ArrayList<>();
        int []arr=new int[nums.length+2];
        arr[0]=lower-1;
        arr[1]=upper+1;
        int k=0;
        for(int i=2;i<arr.length;i++){
         arr[i]=nums[k++];
         }
        int len=arr.length,ind_low=0,ind_up=0; 
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            if(arr[i]==lower-1) ind_low=i;
            if(arr[i]==upper+1) ind_up=i;
        }

    for(int j=ind_low ;j < ind_up;j++){
       if(arr[j + 1] - arr[j] > 1){
        List<Integer> newlist =  new ArrayList<>();
        newlist.add(arr[j]+1);
        newlist.add(arr[j+1]-1);
        list.add(newlist);
       }
    }
        return list;
    }
}
