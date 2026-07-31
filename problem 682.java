class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
            st.pop();
        }
        else if(operations[i].equals("D")){
            int num=st.pop();
            st.push(num);
            int d=2*num;
            st.push(d);
        }
        else if(operations[i].equals("+")){
            int n1=st.pop();
            int n2=st.pop();
            st.push(n2);
            st.push(n1);
            int sum1=n1+n2;
            st.push(sum1);
        }
        else{
            int n=Integer.parseInt(operations[i]);
            st.push(n);
        }
        }
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}
