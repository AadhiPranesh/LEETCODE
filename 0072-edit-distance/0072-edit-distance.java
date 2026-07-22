class Solution {
    public int minDistance(String word1, String word2) {
        int n =word1.length();
        int m=word2.length();
        int[][] arr=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            arr[i][0]=i;
        }
        for(int j=0;j<=m;j++)
        {
            arr[0][j]=j;
        }
     
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1];
                }
                else
                {
                    int topleft = arr[i-1][j-1];
                    int top=arr[i-1][j];
                    int left=arr[i][j-1];
                    int min= Math.min(topleft,(Math.min(top,left)))+1;
                    arr[i][j]=min;
                }
            }
    }
    return arr[n][m];
    }
}