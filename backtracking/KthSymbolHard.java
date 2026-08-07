package backtracking;

public class KthSymbolHard {
    
    // TC: O(log B)
    // SC: O(log B)
    public int solve(int A, Long B) {

        return helper(A, B, 0);
    }

    private int helper(int row, long index, int value) {
        if (row == 1)
            return value;

        long half = 1L << (row - 2);   // Doesn't work when row > 63

        if (index < half)
            return helper(row - 1, index, value);
        else
            return helper(row - 1, index - half, 1 - value);
    }
}
