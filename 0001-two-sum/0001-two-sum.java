class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        map.put(nums[i],i);
    }
    int  t=target;
   // int []arr=new int[2];
    for(int i=0;i<nums.length;i++)
    {
        int check=t-nums[i];
        if(map.containsKey(check) && map.get(check)!=i )
        {
            return new int[]{i,map.get(check)};
        }
    }
    return new int[0];
    }
}