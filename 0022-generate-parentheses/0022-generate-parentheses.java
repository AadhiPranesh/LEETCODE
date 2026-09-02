class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new  ArrayList<>();
        backtracking(0,0,n,ans,"");
        return ans;
    }
     void backtracking(int start, int end, int max, List<String> ans,String str){
        if(str.length()== max*2)
        {
            ans.add(str);
            return;
        }
        if(start<max)
        {

            backtracking(start+1,end,max,ans,str+"(");
        }
        if(end<start)
        {
            backtracking(start,end+1,max,ans,str+")");
        }
     }
}