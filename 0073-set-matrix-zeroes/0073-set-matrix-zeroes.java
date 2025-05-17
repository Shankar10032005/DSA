class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        int[] n=new int[matrix.length];
        int[] m=new int[ matrix[0].length];

        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                if(matrix[i][j]==0){
                    n[i]=1;
                    m[j]=1;
                }
            }
        }
        
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                if(n[i]==1 || m[j]==1 ){
                    matrix[i][j]=0;
                }
            }
        }



    }
}