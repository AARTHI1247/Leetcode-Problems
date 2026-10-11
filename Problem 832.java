class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int first=0,last=image[i].length-1;
            while(first<last){
                int temp=image[i][first];
                image[i][first]=image[i][last];
                image[i][last]=temp;
                first++;
                last--;}
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}
