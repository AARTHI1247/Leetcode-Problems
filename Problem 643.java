class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j=0,sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        double max=sum/(double)k,av=0;
        for(int i=k;i<nums.length;i++){ sum+=nums[i]-nums[j++];
            av=sum/(double)k;
            if(av>max) max=av;
        }
        return max;
    }
}
