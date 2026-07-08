class Solution {
    public int splitArray(int[] nums, int k) {
      //  int cursum=0;
        int high=0;
        int low=0;
        for(int n:nums)
        {
            low=Math.max(low,n);
            high+=n;
        }
        while(low<high)
        {
            int subarr=1;
            int cursum=0;
            int mid=low+(high-low)/2;
            for(int n : nums)
            {
                if(n+cursum<=mid)
                {
                    cursum+=n;
                }
                else{
                    subarr++;
                    cursum=n;
                }
            }
            if(subarr<=k)
            {
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}