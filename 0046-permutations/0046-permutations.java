class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(nums);
      backtrack(ans,new ArrayList<>(),nums);
        return ans;
    }
    void backtrack(List<List<Integer> >ans , List<Integer> cur, int []nums)
    {
        if(cur.size()== nums.length)
    ans.add(new ArrayList<>(cur));
     else 
     {
    for(int i=0 ; i<nums.length;i++)
    {
        if(cur.contains(nums[i])) continue;
        cur.add(nums[i]);
        backtrack( ans,cur,nums);
        cur.remove(cur.size()-1);
    }
    }}
}