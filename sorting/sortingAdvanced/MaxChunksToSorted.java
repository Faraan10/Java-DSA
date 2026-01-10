package sorting.sortingAdvanced;

public class MaxChunksToSorted {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A) {

        int maxSoFar = 0;
        int chunks = 0;

        for (int i = 0; i < A.length; i++) {
            maxSoFar = Math.max(maxSoFar, A[i]);

            if (maxSoFar == i) {
                chunks++;
            }
        }
        return chunks;
    }
}
