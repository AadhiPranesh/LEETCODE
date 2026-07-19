class Solution {
    public String smallestSubsequence(String s) {
        int [] freq=new int[26];
        //  FOR COUNTINH THE frequences ofthe each cahracter
        boolean []visited = new boolean[26];
        //  verfing the character where is visited or not 
        for(char c: s.toCharArray())
        {
            freq[c-'a']++;
        }
        // create the stack for  push each the character 
        Stack<Character> stack=new Stack<>();

        for( char cur:s.toCharArray())
        {
                freq[cur-'a']--;
                if(visited[cur-'a'])
                {
                    continue;
                }
                 while( !stack.isEmpty() &&   stack.peek() > cur  && freq[stack.peek()-'a']>0)
                 {
                     visited[stack.pop()-'a']=false;
                 }
                 stack.push(cur);
                 visited[cur-'a']=true;
        }
        StringBuilder str=new StringBuilder();
       for( char c :stack)
        {
                str.append(c);
        }
        return str.toString();
    }
}