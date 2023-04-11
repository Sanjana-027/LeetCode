class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.pop();
            }
            else stack.push(ch);
        }
        while (!stack.empty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString(); 
    }
}


