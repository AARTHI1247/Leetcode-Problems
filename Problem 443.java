class Solution {
    public int compress(char[] chars) {
        int i=0,j=1,c=1;
        StringBuilder sb=new StringBuilder();
        while(j<=chars.length-1){
            if(chars[i]==chars[j]){
                c++;
            }
            else{
                sb.append(chars[i]);
                if(c!=1){
                sb.append(c);
                }
                c=1;
                i=j;
            }
            j++;
        }
        sb.append(chars[i]);
        if(c != 1){
        sb.append(c);
    }
        String str=new String(sb);
        char arr[]=str.toCharArray();
        int k=0;
        for(int l=0;l<arr.length;l++){
            chars[k++]=arr[l];
        }
        int n=sb.length();
        return n;
    }
}
