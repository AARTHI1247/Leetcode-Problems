class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length,n=matrix[0].length;
        int arr[][]=new int[m][n];
        int r=0,c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r=i;
                    c=j;                    
               for(int l=0;l<m;l++){
                for(int k=0;k<n;k++){
                   if(l==r||k==c){
                    arr[l][k]=0;
                   }
                }}
               }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}
