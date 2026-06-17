package AllBasicProblemsList;

import java.util.Arrays;

public class KthSmallest {
    
    // TC: O(N log N)
    // SC: O(1)
    public int kthsmallest(final int[] A, int B) {

        Arrays.sort(A);

        return A[B-1];
    }
}
