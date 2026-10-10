class Solution {
    public String reverseWords(String s) {
    String string="";
    String arr[]=s.split(" ");
    for(int i=0;i<arr.length;i++){
        StringBuilder str=new StringBuilder(arr[i]);
        string=string+str.reverse().toString()+" ";   
    }
    return string.trim();
    }
}
