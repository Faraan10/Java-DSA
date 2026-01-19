package stacks;

import java.util.Stack;

public class NearestSmallerElement {
    
    // TC: O(N)
    // SC: O(N)

    // below solving problem using elements storing in the stack
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

    // solving problem while storing the indices in the stack 
    // better approach as using indices will have more flexibility 
    public int[] prevSmallerIndices(int[] A){

        int N=A.length;
        int[] arr=new int[N];

        return arr;
    }
}
