class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,i=s.length()-1;
        Stack<Character> stack=new Stack<>();
        while(i>=0){
            if(!stack.contains(s.charAt(i))){
            stack.push(s.charAt(i));
            if(max<stack.size()) max=stack.size();
            i--;
            }
            else{
                while(stack.contains(s.charAt(i))) stack.remove(0);
            }
        }
        return max;
    }
}
