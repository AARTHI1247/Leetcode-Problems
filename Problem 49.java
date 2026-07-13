class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        String arr[]=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            arr[i]=strs[i];
        }
        for(int i=0;i<strs.length;i++){
            char[] ch=arr[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            arr[i]=s;
        }
        for(int i=0;i<strs.length;i++){
            List<String> s=new ArrayList<>();
            if(!arr[i].equals("-")){
                s.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(!arr[j].equals("-")){
                    if(arr[i].equals(arr[j])){
                        s.add(strs[j]);
                        arr[j]="-";
                    }
                }
            }
                list.add(s);
            }
            
        }
        return list;
    }
}
