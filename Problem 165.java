class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        String arr1[]=version1.split("\\.");
        String arr2[]=version2.split("\\.");
        while(i<arr1.length && j<arr2.length){
            int val1=Integer.parseInt(arr1[i]);
            int val2=Integer.parseInt(arr2[j]);
            if(val1<val2)return -1;
            else if(val1>val2)return 1;
            else {
                i++;
                j++;}
        }
        while(i<arr1.length){
            int val=Integer.parseInt(arr1[i]);
            if(val==0)i++;
            else if(val>0) return 1;
        }
        while(j<arr2.length){
            int val=Integer.parseInt(arr2[j]);
            if(val==0)j++;
            else if(val>0) return -1;
        }
        return 0;
    }
}
