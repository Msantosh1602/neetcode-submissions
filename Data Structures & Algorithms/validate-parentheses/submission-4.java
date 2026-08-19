class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char ch:s.toCharArray()){
            if(ch==']'){
                if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
                else if(stack.isEmpty() || stack.peek()!='[') return false;
            }else if(ch=='}'){
                if(!stack.isEmpty() && stack.peek()=='{') stack.pop();
                else if(stack.isEmpty() || stack.peek()!='{') return false;
            }else if(ch==')'){
                if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
                else if(stack.isEmpty() || stack.peek()!='(') return false;
            }else if(ch=='[' || ch=='{' || ch=='(') stack.push(ch);
        }
        return stack.isEmpty();
    }
}
