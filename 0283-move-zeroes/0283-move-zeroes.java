class Solution {
    public void moveZeroes(int[] nums) {
        int []arr=new int[nums.length];
        int c=0;
        int i=0;
        int j=nums.length-1;
        for(int n:nums)
        {
            if(n==0)
            {
                arr[j--]=0;
                c++;
            }
            else{
                arr[i++]=n;
            }
        }
       for(int k=0;k<nums.length;k++)
       {
        nums[k]=arr[k];
       }
    }
}