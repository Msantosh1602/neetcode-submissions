class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String s:tokens){
            if(s.equals("+") ||s.equals("-") ||s.equals("*") ||s.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int c=0;
                switch(s){
                    case "+":
                        c=a+b;
                        break;
                    case "-":
                        c=a-b;
                        break;
                    case "*":
                        c=a*b;
                        break;
                    case "/":
                        c=a/b;
                        break;
                }
                stack.push(c);
            }else stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}