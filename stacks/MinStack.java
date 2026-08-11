package stacks;

import java.util.Stack;

public class MinStack {
    
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    // TC: O(1) for all operations
    // SC: O(1)
    public void push(int x) {

        st1.push(x);

        if(st2.isEmpty() || x<=st2.peek()){
            st2.push(x);
        }
    }

    public void pop() {
        
        if(st1.isEmpty()){
            return;
        }

        int x=st1.pop();

        if(x==st2.peek()){
            st2.pop();
        }
    }

    public int top() {
        
        if(st1.isEmpty()){
            return -1;
        }

        return st1.peek();
    }

    public int getMin() {
        
        if(st2.isEmpty()){
            return -1;
        }

        return st2.peek();
    }
}
