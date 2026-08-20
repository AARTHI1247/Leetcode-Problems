class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> arrlist=new  ArrayList<>();
        for(int i=0;i<s.length();i++){
            arrlist.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(!arrlist.contains(t.charAt(i)))return t.charAt(i);
            else{
                if(arrlist.contains(t.charAt(i))){
                    arrlist.remove(Character.valueOf(t.charAt(i)));
                }
            };
        }
        return ' ';
    }
}
