package backtracking;

public class KthSymbol {
    
    // TC: O(1)
    // SC: O(1)
    public int solve(int A, int B) {
        return Integer.bitCount(B) % 2;
    }
}
