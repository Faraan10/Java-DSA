package queues;

import java.util.Stack;

public class QueueUsingStack {


    // This below code is not optimized 
    // TC: O(1) push , O(N) pop, O(N) peek and O(1) isEmpty()
    // SC: O(N)
    // public static class UserQueue {
    // /** Initialize your data structure here. */

    //     static Stack<Integer> st1;
    //     static Stack<Integer> st2;
    //     UserQueue() {
    //         st1=new Stack<>();
    //         st2=new Stack<>();
    //     }
        
    //     /** Push element X to the back of queue. */
    //     static void push(int X) {

    //         st1.push(X);
    //     }
        
    //     /** Removes the element from in front of queue and returns that element. */
    //     static int pop() {
            
    //         while(!st1.isEmpty()){
    //             st2.push(st1.pop());
    //         }

    //         int ans=st2.pop();

    //         while(!st2.isEmpty()){
    //             st1.push(st2.pop());
    //         }

    //         return ans;
    //     }
        
    //     /** Get the front element of the queue. */
    //     static int peek() {
            
    //         while(!st1.isEmpty()){
    //             st2.push(st1.pop());
    //         }

    //         int ans=st2.peek();

    //         while(!st2.isEmpty()){
    //             st1.push(st2.pop());
    //         }
    //         return ans;
    //     }
        
    //     /** Returns whether the queue is empty. */
    //     static boolean empty() {
            
    //         return st1.isEmpty();
    //     }
    // }


    // TC: push: O(1) pop: amortized O(1)  peek: amortized O(1)
    // SC: O(N) stack used
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
