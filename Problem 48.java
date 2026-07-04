class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int a[][]=new int[n][n];
        int l=0,k=0;
        for(int i=n-1;i>=0;i--){
            l=0;
            for(int j=0;j<n;j++){
                a[l][k]=matrix[i][j];
                l++;
            }
            k++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
}
