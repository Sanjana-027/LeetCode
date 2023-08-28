class MyStack {
    LinkedList<Integer> stack;
    public MyStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        return stack.removeLast();
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
