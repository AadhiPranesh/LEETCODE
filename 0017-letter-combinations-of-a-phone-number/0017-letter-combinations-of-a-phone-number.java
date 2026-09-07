class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>  ans =new ArrayList<>();
        String []phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtracking(digits,0,"",phone,ans);
        return ans;
    }
    void backtracking(String digits, int index, String cur, String[] phone,List<String> ans)
    {
     if(index==digits.length())
     {
        ans.add(cur);
        return;
     }   
     String letters=phone[digits.charAt(index)-'0'];
     for(char a:letters.toCharArray()){
        backtracking(digits,index+1,cur+a,phone,ans);
     }
    }
}