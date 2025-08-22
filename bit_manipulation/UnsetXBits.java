package bit_manipulation;

public class UnsetXBits {
    
    // TC: O(1)
    // SC: O(1)
    public Long solve(Long A, int B) {

        int mask = ~((1 << B) - 1);
        return A & mask;
    }
}
