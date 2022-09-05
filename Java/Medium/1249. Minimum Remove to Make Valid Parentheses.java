class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') stack.push(i);
            else if (sb.charAt(i) == ')') {
                if (!stack.empty())
                    stack.pop();
                else sb.setCharAt(i, '*');
            }
        }
        
        while (!stack.empty()) {
            sb.setCharAt(stack.pop(), '*');
        }
        return sb.toString().replaceAll("\\*", "");
    }
}

// 2nd Approach

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') stack.add(i + 1);
            else if (sb.charAt(i) == ')') {
                if (!stack.empty() && stack.peek() >= 0)
                    stack.pop();
                else stack.add(-(i + 1));
            }
        }
        
        while (!stack.empty())
            sb.deleteCharAt(Math.abs(stack.pop()) - 1);
        return sb.toString();
    }
}
