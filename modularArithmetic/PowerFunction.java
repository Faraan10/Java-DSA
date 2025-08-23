package modularArithmetic;

public class PowerFunction {
    
    public int pow(int A, int B, int C) {
       
        
         if (B == 0) return 1%C;
        long half = pow(A, B / 2, C);
        long result = (half * half) % C;
        if (B % 2 != 0) {
            result = (result * (A%C)) % C;
        }

        result=(result+C) % C;
        return (int)result;
    }
}
