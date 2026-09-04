class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0) return new int[0];
        Arrays.sort(changed);
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<changed.length;i++){
            if(!map.containsKey(changed[i])) map.put(changed[i],1);
            else map.put(changed[i],map.get(changed[i])+1);
        }
         int num=0,doub=0 ;
       for(int i=0;i<changed.length;i++){
            num=changed[i];
            doub=num*2;
        if(map.get(num)==0) continue;
        if(!map.containsKey(doub) || map.get(doub)==0) return new int[0];
        arr.add(num);
        map.put(num,map.get(num)-1);
        map.put(doub,map.get(doub)-1);
        }
         return arr.stream().mapToInt(x->x).toArray();
    }
}
