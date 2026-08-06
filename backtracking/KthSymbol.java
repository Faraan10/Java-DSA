package backtracking;

public class KthSymbol {
    
    // TC: O(1)
    // SC: O(1)
    public int solve(int A, int B) {
        return Integer.bitCount(B) % 2;
    }

    // TC: O(A)
    // SC: O(A)
    public int backtrackSolve(int A, int B) {

        return helper(A, B, 0);
    }

    private int helper(int row, int index, int value) {
        if (row == 1)
            return value;

        int half = 1 << (row - 2);

        if (index < half) {
            // Left child
            return helper(row - 1, index, value);
        } else {
            // Right child
            return helper(row - 1, index - half, 1 - value);
        }
    }
}
