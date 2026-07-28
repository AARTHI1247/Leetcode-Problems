class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
        String str[]=s.split(" ");
        if(pattern.length()==str.length){
            for(int i=0;i<pattern.length();i++){
                if(!(hm.containsKey(pattern.charAt(i)))){
                    if(!(hm.containsValue(str[i]))){
                    hm.put(pattern.charAt(i),str[i]);
                    }
                    else{
                        return false;  
                }
                }
                else{
                    if(!(str[i].equals(hm.get(pattern.charAt(i))))){
                        return false;
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
