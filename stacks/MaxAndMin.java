package stacks;

import java.util.Stack;

public class MaxAndMin {
    
    public int solve(int[] A) {

        int[] leftSmaller=leftSmallerIndex(A);
        int[] rightSmaller=rightSmallerIndex(A);
        int[] leftGreater=leftGreaterIndex(A);
        int[] rightGreater=rightGreaterIndex(A);

        int N=A.length;
        long sum=0;
        long MOD=1000000007L;

        for(int i=0; i<N; i++){
            long minContribution=(long)(rightSmaller[i] - i)*(long)(i - leftSmaller[i]);
            long maxContribution=(long)(rightGreater[i]-i)*(long)(i-leftGreater[i]);

            sum = (sum + (((maxContribution - minContribution + MOD) % MOD) * A[i]) % MOD) % MOD;
        }
        return (int)sum;
    }

    public int[] leftSmallerIndex(int[] A){

        int N=A.length;
        int[] arr=new int[N];
        Stack<Integer> st=new Stack<>();
        arr[0]=-1;
        st.push(0); // first element index
        
        for(int i=1; i<N; i++){

            while(!st.isEmpty() && A[st.peek()]>=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
        return arr;
    }

    public int[] rightSmallerIndex(int[] A){

        int N=A.length;
        int[] arr=new int[N];
        Stack<Integer> st=new Stack<>();
        arr[N-1]=N;
        st.push(N-1);

        for(int i=N-2; i>=0; i--){

            while(!st.isEmpty() && A[st.peek()]>=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=N;
            }else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
        return arr;
    }

    public int[] leftGreaterIndex(int[] A){

        int N=A.length;
        int[] arr=new int[N];
        Stack<Integer> st=new Stack<>();

        arr[0]=-1;
        st.push(0); // first element index
        
        for(int i=1; i<N; i++){

            while(!st.isEmpty() && A[st.peek()]<=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
        return arr;
    }

    public int[] rightGreaterIndex(int[] A){

        int N=A.length;
        int[] arr=new int[N];
        Stack<Integer> st=new Stack<>();

        arr[N-1]=N;
        st.push(N-1);

        for(int i=N-2; i>=0; i--){

            while(!st.isEmpty() && A[st.peek()]<=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=N;
            }else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
        return arr;
    }
}
