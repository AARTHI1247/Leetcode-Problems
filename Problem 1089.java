class Solution {
    public void duplicateZeros(int[] arr) {
        int nums[]=new int[arr.length];
        int k=0,i=0;
        while(k<arr.length && i<arr.length){
            if(arr[i]==0 && k+1<arr.length) {
                nums[k]=0;
                nums[k+1]=0;
                k++;
            }
            else nums[k]=arr[i];
            i++;
            k++;
        }
        int j=0;
        while(j<nums.length){
        arr[j]=nums[j];
        j++;
       }
    }
}
