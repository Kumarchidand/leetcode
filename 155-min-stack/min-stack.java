class MinStack {
    private Stack<Integer>st;
    private Stack<Integer>minst; 

    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        if(st.size()==0 || minst.peek()>=val){
            minst.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
       int ele1=st.pop();
       int ele2=minst.peek();
       if(ele1==ele2){
           minst.pop();
       } 
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */