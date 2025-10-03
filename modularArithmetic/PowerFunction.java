package modularArithmetic;

public class PowerFunction {
    
    public int power(int A, int B, int C) {
       
        // TC: O(N)
        // SC: O(N)
         if (B == 0) return 1%C;
        long half = power(A, B / 2, C);
        long result = (half * half) % C;
        if (B % 2 != 0) {
            result = (result * (A%C)) % C;
        }

        result=(result+C) % C;
        return (int)result;
    }
}
