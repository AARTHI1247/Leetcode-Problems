class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long left=0,right=nums.length-1;
        long sum=0;
        while(left<=right){
            if(left==right){
                return sum+=nums[(int)left];
            }
            long le=nums[(int)left];
            long ri=nums[(int)right];
            long temp=ri;
            while(temp>0){
                temp/=10;
                le*=10;
            }
             sum+=le+ri;
            left++;
            right--;
        }
        return sum;
    }
}
