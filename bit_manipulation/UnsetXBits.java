package bit_manipulation;

public class UnsetXBits {
    
    public Long solve(Long A, int B) {

        int mask = ~((1 << B) - 1);
        return A & mask;
    }
}
