package LinkedLists.Stacks;

import java.util.Stack;

public class EvalRPN {
     public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String m : tokens){
            if(m.equals("+") || m.equals("-") || m.equals("*") || m.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                if(m.equals("+")) result = a+b;
                else if(m.equals("-")) result = a-b;
                else if(m.equals("*")) result = a*b;
                else result = a/b;
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(m));
            }
        }
        return stack.pop();
    }
}
