package stacks;

import java.util.Stack;

public class LargestAreaInHistogram {
    
    // TC: O(N)
    // SC: O(N)
    public int[] leftSmallerArray(int[] A){

        int N=A.length;
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[N];

        arr[0]=-1; // as there is no smaller element on left so -1
        st.push(0); // as first element does not have left element so pushing first index into Stack

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

    public int[] rightSmallerArray(int[] A){

        int N=A.length;
        int[] arr=new int[N];
        Stack<Integer> st=new Stack<>();

        arr[N-1]=N; // as there is no right smaller element and we cannot place -1 as we have to get width of rectangle
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

    public int largestRectangleArea(int[] A) {

        int N=A.length;
        int[] leftSmaller=leftSmallerArray(A);
        int[] rightSmaller=rightSmallerArray(A);

        int maxSum=0;

        for(int i=0; i<N; i++){
            int width=rightSmaller[i]-leftSmaller[i]-1;
            int area=A[i]*width;
            maxSum=Math.max(maxSum, area);
        }
        return maxSum;
    }
}
