class Solution {
    public int calculate(String s) {

        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        
        int currentNumber = 0;
        char operation = '+';
        
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
                if (operation == '-') {
                    stack.push(-currentNumber);
                }
                else if (operation == '+') {
                    stack.push(currentNumber);
                }
                else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                }
                else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}

// 2 + 4 / 2 * 3
 


// Scan      currNo    Operation     
//   3         3           +
//   +         0           + 
//   2         2           +
//   *         0           *
//   2
//   +         2           


// Stack
//   4





