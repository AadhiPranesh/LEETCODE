class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][]m1= new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                m1[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<n;k++)
                    {
                        m1[k][j]=0;
                    }
                    for(int k=0;k<m;k++)
                    {
                        m1[i][k]=0;
                    }
                }

            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=m1[i][j];
            }
        }
    }
}