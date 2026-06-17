class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            HashSet<Character> s=new HashSet<>();
            
            for(int j=0;j<9;j++)
            {
                char c=board[i][j];
                if(s.contains(c)){
                    return false;
                }
                if(c!='.'){
                    s.add(c);
                }
                    
            }
        }
        for(int i=0;i<9;i++){
            HashSet <Character> s=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                char c =board[j][i];
                if(s.contains(c))
                {
                    return false;
                }
                if(c!='.')
                {
                    s.add(c);
                }

            }
        }
        for(int row=0;row<9;row+=3)
        {
            for(int colum=0;colum<9;colum+=3)
            {
                HashSet <Character> s=new HashSet<>();
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        char c=board[i+row][j+colum];
                        if(s.contains(c))
                        {
                            return false;
                        }
                        if(c!='.')
                        {
                            s.add(c);
                        }
                    }
                }
            }
        }
        return true;
    }
}