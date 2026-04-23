package heaps;

public class HeapSort {
    
    // TC: O(N log N)
    // SC: O(1) no extra space
    public int[] HeapSortProblem(int[] A){

        int N=A.length;
        for(int i=N/2-1; i>=0; i--){
            heapify(A, N, i);
        }

        for(int i=N-1; i>0; i--){

            int temp=A[0];
            A[0]=A[i];
            A[i]=temp;

            heapify(A, i, 0);
        }

        return A;
    }

    public void heapify(int[] A, int N, int i){

        while(true){
            int largest=i;
            int left=2*i+1;
            int right=2*i+2;

            if(left<N && A[left]>A[largest]){
                largest=left;
            }
            if(right<N && A[right]>A[largest]){
                largest=right;
            }

            if(largest==i) break;

            int temp=A[i];
            A[i]=A[largest];
            A[largest]=temp;

            i=largest;
        }
    }
}
