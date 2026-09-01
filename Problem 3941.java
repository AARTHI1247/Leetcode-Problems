class Solution {
    public int passwordStrength(String password) {
        int val=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<password.length();i++) set.add(password.charAt(i));
        for(char c:set){
        if(c>='a' && c<='z')  val+=1;
        else if(c>='A' && c<='Z')  val+=2;
        else if(c>='0' && c<='9')  val+=3;
        else val+=5;
        }
        return val;
    }
}
