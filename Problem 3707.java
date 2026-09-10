class Solution {
    public boolean scoreBalance(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<26;i++){
            char ch=(char)(97+i);
            map.put(ch,i+1);
        }
        int left[]=new int[s.length()];
        int right[]=new int[s.length()];
        int right_sum=0,left_sum=0;
        for(int i=0;i<s.length()-1;i++){
             left_sum+=map.get(s.charAt(i));
            left[i]=left_sum;
        }
        for(int i=s.length()-1;i>=0;i--){
           right_sum+=map.get(s.charAt(i));
            right[i]=right_sum;
        }
        for(int i=0;i<=s.length()-2;i++){
            if(left[i]==right[i+1]) return true;
        }
        return false;
    }
}
