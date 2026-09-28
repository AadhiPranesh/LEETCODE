class Solution {
    public int maxDepth(String s) {
      int max=0;
      int maxdept=0;
      for(char c:s.toCharArray())
      {
        if(c=='(')
        {
            max++;
            maxdept=Math.max(max,maxdept);
        }
        if(c==')')
        {
            max--;
        }
      }
      return maxdept;  
    }
}