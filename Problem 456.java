class Solution {
    public boolean find132pattern(int[] nums) {
        int inc=0,dec=0,n=nums.length,f=0,f2=0;
            int num2=Integer.MIN_VALUE;
            Stack<Integer>st=new Stack<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc=1;
            }
            else{
                dec=1;
            }
        }
        if(inc==1 && dec==1){
            int i=n-1;
            while(i>=0){
                if(num2>nums[i]){
                    return true;
                }
                while (!st.isEmpty() && nums[i] > st.peek()){
                    num2=st.pop();
                }
                    st.push(nums[i]);
                i--;
            }
        }
        return false;
}
}
