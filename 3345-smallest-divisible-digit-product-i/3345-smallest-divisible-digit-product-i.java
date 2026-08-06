class Solution {
    public int smallestNumber(int n, int t) {
        
      
        int i=1;
      int d = n;
        while(i!=0)
        {
               d=n;
              int sum=1;
            while(d!=0)
            {
                int r=d%10;
                sum*=r;
                d=d/10;
            }
            i=sum%t;
            if(i>0)
            {
                n++;
            }
        }
        return n;

    }
}