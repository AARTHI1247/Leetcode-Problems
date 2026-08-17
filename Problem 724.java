class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0,rightsum=0;
        if(nums.length==1) return 0;
        int []left=new int[nums.length];
        int []right=new int[nums.length];
        for(int i=0;i<=nums.length-1;i++){
             leftsum+=nums[i];
             left[i]=leftsum;
        }
        for(int i=nums.length-1;i>=0;i--){
             rightsum+=nums[i];
             right[i]=rightsum;
        }
         leftsum=0;
         if(leftsum==right[1]) return 0;
        for(int i=1;i<=nums.length-2;i++){
            if(left[i-1]==right[i+1]) return i;
         }
         rightsum=0;
          if(left[nums.length-2]==rightsum) return nums.length-1;
        return -1;
    }
}
