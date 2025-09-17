package queues;

import java.util.Stack;

public class QueueUsingStack {
    // TC: push: O(1) pop: amortized O(1)
    public static class UserQueue {
    /** Initialize your data structure here. */
    static Stack<Integer> st;
    static Stack<Integer> newSt;
    UserQueue() {
        st=new Stack<>();
        newSt=new Stack<>();
    }
    
    /** Push element X to the back of queue. */
    static void push(int X) {
        st.push(X);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        if(newSt.isEmpty()){
            while(!st.isEmpty()){
                newSt.push(st.pop());
            }
        }
        return newSt.pop();
    }
    
    /** Get the front element of the queue. */
    static int peek() {
        if(newSt.isEmpty()){
            while(!st.isEmpty()){
                newSt.push(st.pop());
            }
        }
        return newSt.peek();
    }
    
    /** Returns whether the queue is empty. */
    static boolean empty() {
        
        return st.isEmpty() && newSt.isEmpty();
    }
}

/**
 * Your UserQueue object will be instantiated and called as such:
 * UserQueue obj = new UserQueue();
 * obj.push(X);
 * int param2 = obj.pop();
 * int param3 = obj.peek();
 * boolean param4 = obj.empty();
 */
}
