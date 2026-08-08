class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> a=new Stack<>();
        int i=0,j=0;
        while(j<popped.length && i<pushed.length){
            a.push(pushed[i]);
            if(popped[j]==a.peek()){
                while(!a.isEmpty() && j<popped.length && popped[j]==a.peek()){
                    a.pop();
                    j++;
                }
                i++;
            }
            else{
                i++;
            }
        }
        if(j==popped.length){
        return true;
        }
        return false;
    }
}
