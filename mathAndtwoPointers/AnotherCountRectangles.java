package mathAndtwoPointers;

public class AnotherCountRectangles {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A, int B) {

        int n = A.length;
        int i = 0;
        int j = n - 1;

        long count = 0;
        long MOD = 1000000007L;

        while (i < n && j >= 0) {

            if ((long) A[i] * A[j] < B) {
                // A[i] can pair with every element from 0 to j
                count = (count + j + 1) % MOD;
                i++;
            } else {
                j--;
            }
        }

        return (int) count;
    }
}
