class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int j=0;// innerlength
         int i=0; //outerlength
         int sum=0;
         int subarr=Integer.MAX_VALUE;
         while(i<nums.length)
         {
             sum+=nums[i];
             i++;
             while(sum>=target)
             {
                int cursubarrlen= i-j; //current sub array length
                subarr=Math.min(cursubarrlen,subarr);
                sum-=nums[j];
                j++;
             }
         }
         return subarr==Integer.MAX_VALUE?0:subarr;
    }
}