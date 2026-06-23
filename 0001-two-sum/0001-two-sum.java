
class Solution {
    public int[] twoSum(int[] nums, int t) {  
      HashMap<Integer,Integer>map= new HashMap<>();       
       for(int i=0;i<nums.length;i++)
        {
             int c=t-nums[i];
             if(!(map.containsKey(c)))
             { 
                map.put(nums[i],i);
        }        
        else{
            return new int[]{map.get(t-nums[i]),i};
        }
    }
   return new int[0]; 
}
}