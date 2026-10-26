class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int val=Math.min(height[left],height[right])*(right-left);
            if(max<val)max=val;
            if(height[left]<height[right])left++;
            else right--;
        }
        return max;
    }
}
