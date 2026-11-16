class Solution {
    public int countGoodSubstrings(String s) {
        int i=0,j=3,count=0;
        while(i<s.length()-2){
            String str=s.substring(i,j);
            HashSet<Character>set= new HashSet<>();
            for(int k=0;k<3;k++) set.add(str.charAt(k));
            if(set.size()==3) count++;
            i++;
            j++;
        }
        return count;
    }
}
