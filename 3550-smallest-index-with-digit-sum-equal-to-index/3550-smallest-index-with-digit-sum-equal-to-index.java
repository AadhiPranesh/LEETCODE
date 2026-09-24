class Solution {
    public int smallestIndex(int[] nums) {
        //ArrayList<Integer> list =new ArrayList<>();
        
        int  min=-1;
        int  maxmin=-1;
        for(int i = 0;i<nums.length;i++)
        {
            int temp=nums[i];
            int sum=0;
            while(temp>0)
            {
                int a=temp%10;
                sum+=a;
                temp=temp/10;
            }
            if(sum==i)
            {
                min=i;
                return i;
            }
        }
        return -1;
        
    }
}