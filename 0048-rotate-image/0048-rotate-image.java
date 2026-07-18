class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][]m2= new int [n][m];
      
        
                for(int  j=0;j<n;j++)
                {
                     for(int k=0;k<m;k++)
                     {
                        m2[k][n-j-1]=matrix[j][k];
                     }
                }

        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=m2[i][j];
            }
        }
    }
}