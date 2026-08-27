class Solution {
    public void gameOfLife(int[][] board) {
        int row= board.length;
        int cols= board[0].length;
        int [][] copy=new int[row][cols];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                copy[i][j]=board[i][j];
            }
        }
    
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                    int count =0;
                for(int x=i-1;x<=i+1;x++)
                {
                    for(int y=j-1;y<=j+1;y++)
                    {
                        if(i==x && j==y)
                        {
                            continue;
                        }
                        if(x>=0 && x<row  && y >=0 && y<cols)
                        {
                             if(copy[x][y]==1)
                             {
                                count++;
                             }
            
                        }

                        
                    }
                }
                    if(copy[i][j]==1)
                    {
                        if(count<2 || count>3)
                        {
                            board[i][j]=0;
                        }
                    }
                    else{
                        if(count==3)
                        {
                            board[i][j]=1;
                        }
                    }
                
            }
        }
    }
}