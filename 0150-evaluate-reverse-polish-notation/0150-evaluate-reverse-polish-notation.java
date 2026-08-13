class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> stack=new Stack<>();
    for(String a:tokens)
    {
        if(a.equals("+") || a.equals("-") || 
                a.equals("*") || a.equals("/"))
        {
            int c=stack.pop();
            int b= stack.pop();
            if(a.equals("+"))
            {
                stack.push(b+c);
            }
            else if(a.equals("-"))
            {
                stack.push(b-c);
            }
            else if(a.equals("*"))
            {
                stack.push(c*b);
            }
            else{
                stack.push(b/c);
            }
        }
        else{
            stack.push(Integer.parseInt(a));
        }
    }
    return stack.pop();
    }
}