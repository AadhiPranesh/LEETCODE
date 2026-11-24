class Solution {
    public int removeDuplicates(int[] nums) {
    int i=0;
     int l =nums.length;
       for(int j=1;j<l;j++)
       {
        if(nums[i] !=nums[j])
        {
            i++;
            nums[i]=nums[j];
        }
       }
        return i+1;
    }
}