class MinStack {
     private Stack<Integer> stack;
     private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if ((!stack.isEmpty() || !minStack.isEmpty()) && stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        } 
    return stack.peek();
    }
}