class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            if(nums ==null || nums.length<3) return new ArrayList<>();
            Arrays.sort(nums);
            Set<List<Integer>> res=new HashSet<>();
            for(int i=0;i<nums.length-2;i++)
            {
                int left =i+1;
                int rigth=nums.length-1;
                while(left<rigth)

                {
                    int sum = nums[i]+nums[left]+nums[rigth];
                    if(sum==0)
                    {
                        res.add(Arrays.asList(nums[i],nums[left],nums[rigth]));
                        left++;
                        rigth--;
                    }
                    else if (sum<0){
                        left++;
                    }
                    else{
                        rigth--;
                    }
                }

            }
return new ArrayList<>(res);
    }
}
