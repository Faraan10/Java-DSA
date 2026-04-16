package revision;

import java.util.Stack;

class UserQueue{

    Stack<Integer> st1;
    Stack<Integer> st2;
    UserQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
}

public class BuildQueueWithStacks {

    /** Push element X to the back of queue. */
    static void push(int X) {
        st1.push(X);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        if(st2.isEmpty())
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        return st2.pop();
    }
    
    /** Get the front element of the queue. */
    static int peek() {
        if(st2.isEmpty()){
           while(!st1.isEmpty()){
               st2.push(st1.pop());
           } 
        }
        return st2.peek();
    }
    
    /** Returns whether the queue is empty. */
    static boolean empty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }
        return false;
    }

}
