package heaps;

public class BuildHeap {
    
    // TC: O(N)
    // SC:O(1) in place
    public int[] buildHeap(int[] A) {

        int n = A.length;
        // Start from last non-leaf node and heapify
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        return A;
    }

    private void heapify(int[] A, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left] < A[smallest]) {
            smallest = left;
        }

        if (right < n && A[right] < A[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;

            heapify(A, n, smallest);
        }
    }
}
