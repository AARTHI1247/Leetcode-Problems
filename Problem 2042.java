class Solution {
    public boolean areNumbersAscending(String s) {
        String arr[]=s.split(" ");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].matches("\\d+")){
                int val=Integer.parseInt(arr[i]);
                if(max<val) max=val;
                else return false;
            }
        }
        return true;
    }
}
