package stacks;

import java.util.Stack;

public class PassingGame {
    
    // TC: O(N)
    // SC: O(N)
    public int solve(int A, int B, int[] C) {

        Stack<Integer> st=new Stack<Integer>();
        int N=C.length;
        int i=0;
        st.push(B);
        while(i<N){
            if(C[i] != 0){
                st.push(C[i]);
            }else{
                st.pop();
            }
            i++;
        }
        return st.peek();
    }
}
