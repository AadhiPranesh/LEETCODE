class Solution {
  void backtracking(int index,List<Integer> cur,List<List<Integer>> ans, int[] candidates,int target)
    {
        if(index==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList(cur));
            }
            return ;
        }
        if(target>=candidates[index])
        {
            cur.add(candidates[index]);
            backtracking(index,cur,ans,candidates,target-candidates[index]);
            cur.remove(cur.size()-1);
        }   
        backtracking(index+1,cur,ans,candidates,target);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(0,new ArrayList<>(),ans,candidates,target);
            return ans;
    }
    
}