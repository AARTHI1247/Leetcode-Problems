class RandomizedSet {
    HashSet<Integer> set;
    ArrayList<Integer>list;
    public RandomizedSet() {
       set = new HashSet<>();
       list=new ArrayList<>();
    }
    public boolean insert(int val) {
        if(set.add(val)){
        list.add(val);
        return true;
        }
       return false;
    }
    
    public boolean remove(int val) {
        if(set.remove(val)){
        list.remove(Integer.valueOf(val));
        return true;
        }
        return false;
    }
    public int getRandom() {
        Random r=new Random();
        int index=r.nextInt(list.size());
        return list.get(index);
    }
}
