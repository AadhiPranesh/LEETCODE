class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans =new ArrayList<>();
      backtracking(0,ans,new ArrayList(),nums); 
      return ans;
    }
    void backtracking( int index,List<List<Integer>> ans, List<Integer> cur, int[] nums)
    {
        ans.add(new ArrayList<>(cur));   
        for(int i=index;i<nums.length;i++)
        {
            cur.add(nums[i]);
            backtracking(i+1,ans,cur,nums);
            cur.remove(cur.size()-1);
        }
    }

}