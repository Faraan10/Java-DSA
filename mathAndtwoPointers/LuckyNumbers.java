package mathAndtwoPointers;

public class LuckyNumbers {
    
    // TC: O(A log log A)
    // SC: O(A)
    public int solve(int A) {

        // count[i] = number of distinct prime factors of i
        int[] count = new int[A + 1];

        // Sieve
        for (int i = 2; i <= A; i++) {

            // If count[i] == 0, i is prime
            if (count[i] == 0) {

                // i is a prime factor of all its multiples
                for (int j = i; j <= A; j += i) {
                    count[j]++;
                }
            }
        }

        // Count numbers having exactly 2 distinct prime factors
        int ans = 0;

        for (int i = 1; i <= A; i++) {
            if (count[i] == 2) {
                ans++;
            }
        }
        return ans;
    }
}
