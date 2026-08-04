package BinarySearch;

public class AthMagicalNumber {
    

    // TC: O(log(A × min(B, C)))
    // SC: O(1)
    static final int MOD = 1000000007;
    
    public int solve(int A, int B, int C) {

        long low = Math.min(B, C);
        long high = (long) A * Math.min(B, C);

        long gcd = gcd(B, C);
        long lcm = ((long) B / gcd) * C;

        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            long count = mid / B + mid / C - mid / lcm;

            if (count >= A) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) (ans % MOD);
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
