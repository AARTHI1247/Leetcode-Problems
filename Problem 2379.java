class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,j=k;
        int count=0,min=Integer.MAX_VALUE;
        while(j<=blocks.length()){
            String str=blocks.substring(i,j);
            for(int l=0;l<str.length();l++) if(str.charAt(l)=='W') count++;
            min=Math.min(min,count);
            count=0;
            i++;
            j++;
        }
        return min;
    }
}
