class MyStack {
    Queue<Integer> q =new LinkedList<>();


    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());

        }
        
    }
    
    public int pop() {
         return  q.poll();
        
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
        
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna