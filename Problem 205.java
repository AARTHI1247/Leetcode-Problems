class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> arr=new HashMap<>();
        int slen=s.length();
        int tlen=t.length();
        if(slen==tlen){
            for(char i=0;i<slen;i++){
                if(!arr.containsKey(s.charAt(i))){
                    if(arr.containsValue(t.charAt(i))){
                        return false;
                    }
                 arr.put(s.charAt(i),t.charAt(i));
                }
                if(arr.containsKey(s.charAt(i))){
                    if(t.charAt(i)!=arr.get(s.charAt(i))){
                        return false;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
}
