class Solution {
    public int[] diStringMatch(String s) {
        int i=0,left=0,right=s.length();
        int arr[]=new int[s.length()+1];
        while(left<right){
            if(s.charAt(i)=='I'){
            arr[i]=left;
            left++;
            }
            else{
                arr[i]=right;
                right--;
            }
            i++;
        }
        arr[i]=left;
        return arr;
    }
}
