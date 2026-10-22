class Solution {
    public List<List<String>> partition(String s) {
     List<List<String>> result= new ArrayList<>();
     List<String> cur= new ArrayList<>();
     backtrack(0,s,result,cur);
     return result;
    }
    void backtrack(int start,String s,List<List<String>> res, List<String> cur)
    {
        if(start== s.length())
        {
             res.add(new ArrayList<>(cur));
             return;
        }
        for(int end=start;end<s.length();end++)
        {
            String a=s.substring(start,end+1);
            if(ispalindrome(start,end,s))
            {
                cur.add(a);
                backtrack(end+1,s,res,cur);
                cur.remove(cur.size()-1);
            }
        }

    }
    boolean ispalindrome(int start,int end,String s)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}