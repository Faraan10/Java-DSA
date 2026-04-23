package heaps;

public class HeapSort {
    
    public int[] HeapSortProblem(int[] A){

        int N=A.length;
        for(int i=N/2-1; i>=0; i--){
            heapify(A, i);
        }

        for(int i=N-1; i>0; i--){

            int temp=A[0];
            A[0]=A[i];
            A[i]=temp;

            heapify(A, i);
        }

        return A;
    }

    public void heapify(int[] A, int i){

        int N=A.length;

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
