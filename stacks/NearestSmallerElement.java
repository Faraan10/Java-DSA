package stacks;

import java.util.Stack;

public class NearestSmallerElement {
    
    public int[] prevSmaller(int[] A) {

    int[] arr = new int[A.length];
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < A.length; i++) {
        while (!st.isEmpty() && st.peek() >= A[i]) {
            st.pop();
        }
        if (st.isEmpty()) {
            arr[i] = -1;
        } else {
            arr[i] = st.peek();
        }
        st.push(A[i]);
    }
    return arr;
    }
}
