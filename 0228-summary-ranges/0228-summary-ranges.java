class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new  ArrayList<>();
      int i=0;
      String a;
       while(i<nums.length)
       {
         if(i<nums.length-1  && nums[i]+1==nums[i+1])
         {
            int j=i;
          
            while(i<nums.length-1 && nums[i]+1==nums[i+1]  )
            {
                
                i++;
            }
            list.add(nums[j]+"->"+nums[i]);
         }
         else{
            list.add(String.valueOf(nums[i]));
         }
         i++;
       
       }
       return list;
    }
}