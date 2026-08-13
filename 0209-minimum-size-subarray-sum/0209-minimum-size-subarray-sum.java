class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int rigth=0;
        int sum=0;
        int max=Integer.MAX_VALUE;
        while(rigth<nums.length)
        {
            sum+=nums[rigth];
             rigth++;
            while(sum>=target)
            {
                
                max=Math.min(max,rigth-left);
                
                sum-=nums[left];
                left++;
            }
            
            
           
        }
        return max==Integer.MAX_VALUE?0:max;
    }
}