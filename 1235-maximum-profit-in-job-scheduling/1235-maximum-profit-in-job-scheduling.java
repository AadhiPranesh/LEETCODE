class Solution {
    class Jop{
        int start;
        int end;
        int profit;
        Jop(int s,int e,int p)
        {
            start=s;
            end=e;
            profit=p;
        }
        
    }   
    Jop []jops;
        int []memo;
        public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
            int l=startTime.length;
             jops = new Jop[l]; 
            for(int i=0;i<l;i++)
            {
             jops[i]= new Jop(startTime[i],endTime[i],profit[i]);
            }
            Arrays.sort(jops,(a,b)-> a.start-b.start);
             memo= new int[l];
             Arrays.fill(memo,-1);
             return dfs(0);

    }
    private int dfs(int i ){

        if(i==jops.length)
        {
            return 0;
        }
        if(memo[i]!=-1)
        {
            return memo[i];
        }
        int skip=dfs(i+1);
         int next = binarySerach(jops[i].end);
         int take= jops[i].profit+dfs(next);
         return memo[i]=Math.max(skip,take);
        
    }
    // lowerbound
     private int binarySerach(int target)
     {
        int left=0;
        int right=jops.length-1;
        int ans =jops.length;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(jops[mid].start>=target)
            {
                ans=mid;
                right=mid-1;
            }
            else{
                    left=mid+1;
            }
        }
        return ans;

     }
}