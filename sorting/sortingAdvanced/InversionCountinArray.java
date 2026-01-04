package sorting.sortingAdvanced;

public class InversionCountinArray {
    
    // TC: O(N log N)
    // SC: O(N)
    static long MOD = 1000000007;
    public int solve(int[] A) {
        int[] temp = new int[A.length];
        long ans = mergeSort(A, temp, 0, A.length - 1);
        return (int)(ans % MOD);
    }

    private long mergeSort(int[] A, int[] temp, int left, int right) {
        long invCount = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            invCount += mergeSort(A, temp, left, mid);
            invCount += mergeSort(A, temp, mid + 1, right);
            invCount += merge(A, temp, left, mid, right);
        }

        return invCount % MOD;
    }

    private long merge(int[] A, int[] temp, int left, int mid, int right) {
        int i = left;      // left subarray
        int j = mid + 1;   // right subarray
        int k = left;
        long invCount = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
                invCount += (mid - i + 1); // key inversion logic
                invCount %= MOD;
            }
        }

        while (i <= mid) temp[k++] = A[i++];
        while (j <= right) temp[k++] = A[j++];

        for (i = left; i <= right; i++) {
            A[i] = temp[i];
        }

        return invCount % MOD;
    }
}
