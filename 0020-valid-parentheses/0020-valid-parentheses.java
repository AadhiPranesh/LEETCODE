class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char []arr1=s.toCharArray();
        for(int i=0;i<arr1.length;i++){
             if(arr1[i]=='(')
             {
                stack.push(')');
             }
             else if(arr1[i]=='[')
             {
                stack.push(']');
             }
             else if(arr1[i]=='{')
             {stack.push('}');
             } 
            
        else{
           if(stack.isEmpty())
           {
            return false;
           }
           if(stack.pop()!=arr1[i])
           {
             return false;
           }
        }
      
    }
      return stack.isEmpty();
}
}