class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='[')
            {
                    stack.push(']');
            }
             else if(arr[i]=='(')
            {
                stack.push(')');
            }
 else if(arr[i]=='{')
         {
            stack.push('}');
         }
         else
         {
            if(stack.isEmpty())
            {
                return false;
            }
            else if(stack.pop()!= arr[i])
            {
                return  false;
            }
            
         }
        }
        if(stack.isEmpty())
        {
        return true;
    }
    else {
        return false;
    }
    }
}