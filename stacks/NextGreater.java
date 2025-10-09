package stacks;

import java.util.Stack;

public class NextGreater {
    
    // TC: O(N)
    // SC: O(N)
    public int[] nextGreater(int[] A) {

        int N=A.length;
        Stack<Integer> st=new Stack<>();

        int[] arr=new int[N];
        st.push(N-1);
        arr[N-1]=-1;

        for(int i=N-2; i>=0; i--){
            if(!st.isEmpty() && A[st.peek()] > A[i]){
                arr[i]=A[st.peek()];
                st.push(i);
            }else{
                while(!st.isEmpty() && A[st.peek()]<=A[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    arr[i]=A[st.peek()];   
                }else{
                    arr[i]=-1;
                }
                st.push(i);
            }
        }
        return arr;
    }
}
