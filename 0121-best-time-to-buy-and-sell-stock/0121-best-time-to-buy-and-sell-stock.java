class Solution {
    public int maxProfit(int[] prices) {
     int max=0;
     int minprices=Integer.MAX_VALUE;
     for(int i=0;i<prices.length;i++)
     {
      if(minprices>prices[i])
      {
        minprices=prices[i];
      } 
      else{
         max=Math.max(max,prices[i]-minprices);
      }
     }  
    return max; 
    }
}