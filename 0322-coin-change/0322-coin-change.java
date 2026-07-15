class Solution {
    public int coinChange(int[] coins, int amount) {
     int [] dp=new int [amount+1]; // why +1 means    11+1 return the 11 postion
        for(int x=1;x<dp.length;x++) // x is the 
        {
            dp[x]=Integer.MAX_VALUE;
             for(int coin :coins)
             {
                if(x>=coin  &&  dp[x-coin]!=Integer.MAX_VALUE)
                {
                dp[x]=Math.min(dp[x],dp[x-coin]+1);
             }
             }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}




















//https://www.youtube.com/watch?v=0rrgMB_tmho