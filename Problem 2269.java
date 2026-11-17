class Solution {
    public int divisorSubstrings(int num, int k) {
        int temp=num;
        String s=String.valueOf(temp);
        int i=0,j=k,count=0;
        while(j<=s.length()){
            int val=Integer.parseInt(s.substring(i,j));
            if(val!=0 && num%val==0) count++;
            i++;
            j++;
        }
        return count;
    }
}
