class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<houses.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=0;j< heaters.length;j++){
            int num = Math.abs(houses[i] - heaters[j]);
            if(num<min) min=num;
            }
            if(max<min) max=min;
        }
        return max;
    }
}
