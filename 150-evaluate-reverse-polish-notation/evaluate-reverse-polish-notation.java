class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(ch.equals("-")){
                int b= stack.pop() ;
                int a = stack.pop();
                stack.push(a-b);
            }else if(ch.equals("*")){
               stack.push(stack.pop() * stack.pop());  
            }else if(ch.equals("/")){
                int b= stack.pop() ;
                int a = stack.pop();
                stack.push(a/b);
              
            }else{
                 stack.push(Integer.valueOf(ch));
            }
        }
       return stack.pop(); 
    }
}