class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=0,end=0;
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                arr[0]=i;
                st=1;
                break;
                
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                arr[1]=i;
                end=1;
                break;
            }
        }
        if(st==1 && end==1){
            return arr;
        }
        else{
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}
