class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackOfBrackets = new Stack<Character>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(')
                stackOfBrackets.push(')');
            else if (bracket == '{')
                stackOfBrackets.push('}');
            else if (bracket == '[')
                stackOfBrackets.push(']');
            else if (stackOfBrackets.isEmpty() || stackOfBrackets.pop() != bracket)
                return false;
        }
        return stackOfBrackets.isEmpty();
    }
}
