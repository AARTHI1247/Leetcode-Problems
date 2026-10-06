class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x : nums) {
        arr.add(x);}
        int c=0;
        int k=0;
         boolean sort = false;
        while (sort != true) {
            sort = true;
            while(k<arr.size()-1){
            if(arr.get(k)<=arr.get(k+1)) sort=true;
            else{
                 sort=false;
                 break;}
            k++;
        }
            k=0;
        if (sort)
        break; 
        int min=Integer.MAX_VALUE;
        int i=0,j=1;
        int ind_i=0,ind_j=0;
        while(j<arr.size()){
            if(arr.get(i)+arr.get(j)<min){
                min=arr.get(i)+arr.get(j);
                ind_i=i;
                ind_j=j;
            }
            i++;
            j++;
        }
        arr.set(ind_i,min);
        arr.remove(ind_j);
        c++;
        }
        return c;
    }
}
