class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        backtrack(0, new ArrayList<>(),ans,nums);
    return ans;
    }
    void backtrack(int index, List<Integer> cur, List<List<Integer>> ans, int []nums)
    {

            if(index==nums.length)
            {
                 ans.add(new ArrayList<>(cur));
                return ;
            }
        ans.add(new ArrayList<>(cur));
        for(int i=index;i<nums.length;i++)
        {
            cur.add(nums[i]);
         backtrack(i+1,cur,ans,nums);   
        cur.remove(cur.size()-1);
        }
    }
}