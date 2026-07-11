class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length()){
        ArrayList<Character> arr2=new ArrayList<>();
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr.add(s.charAt(i));
            arr2.add(goal.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            char store=arr.get(0);
            arr.remove(0);
            arr.add(store);
            if(arr.equals(arr2)){
                return true;
            }
        }
        }
        return false;
    }
}
