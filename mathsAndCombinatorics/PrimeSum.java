package mathsAndCombinatorics;

public class PrimeSum {
    
    public int[] primesum(int A) {

        boolean[] isPrime = new boolean[A + 1];
        
        // Step 1: Mark all as prime initially
        for (int i = 2; i <= A; i++) {
            isPrime[i] = true;
        }

        // Step 2: Sieve of Eratosthenes
        for (int i = 2; i * i <= A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Find first pair of primes whose sum = A
        for (int i = 2; i <= A; i++) {
            if (isPrime[i] && isPrime[A - i]) {
                return new int[]{i, A - i};
            }
        }

        // Should never reach here as per Goldbach's conjecture
        return new int[]{};
    }
}
