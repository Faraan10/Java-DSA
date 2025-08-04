package bit_manipulation;

public class ToggleBit {
    // TC: O(1)
    // SC: O(1)
    public int solve(int A, int B) {
        return A ^ (1<<B);
    }
}
