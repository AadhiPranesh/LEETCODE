    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] mat= new int[n][n];
            int l = n*n;
        int i=1;
    int left=0;
    int rigth=n-1;
    int top=0;
    int down=n-1;
        while(i<=l)
        {
            for(int j=left;j<=rigth;j++)
            {
                mat[top][j]=i;
                i++;
            }
            top++;
            for(int j=top;j<=down;j++)
            {
                mat[j][rigth]=i;
                i++;
            }
            rigth--;
            if(top<=down)
            {
                for(int j= rigth;j>=left;j--)
                {
                    mat[down][j]=i++;
                
                }
                down--;
            }
            if(left<=rigth)
            {
                for(int j=down;j>=top;j--)
                {
                    mat[j][left]=i++;
                }
            }left++;

        }
        return mat;
        }
    }