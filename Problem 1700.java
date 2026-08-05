class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer>st=new ArrayList<>();
        ArrayList<Integer>sd=new ArrayList<>();
        for(int i=0;i<students.length;i++){
            st.add(students[i]);
            sd.add(sandwiches[i]);
        }
        int c=0;
        while(!st.isEmpty() && c < st.size()){
            if(st.get(0).equals(sd.get(0))){
                st.remove(0);
                sd.remove(0);
                c=0;
            }
            else{
                int val=st.remove(0);
                st.add(val);
                c++;
            }
        }
        return st.size();
    }
}
