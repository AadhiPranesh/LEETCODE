class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int max=0;
        int n=0;
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]-1 )
            {
                 count++;
            }
            else if (nums[i]==nums[i+1]){
                 n=0;
            }
            else {
                count=0;
            }
            max=Math.max(count,max);
        }
            return max+1;
    }
}