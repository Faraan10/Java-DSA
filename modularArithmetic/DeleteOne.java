package modularArithmetic;

public class DeleteOne {
    
    public int solve(int[] A) {

        int n = A.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Build prefix GCD
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = gcd(prefix[i - 1], A[i]);
        }

        // Build suffix GCD
        suffix[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = gcd(suffix[i + 1], A[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int g;
            if (i == 0) {
                g = suffix[1];  // remove first element
            } else if (i == n - 1) {
                g = prefix[n - 2];  // remove last element
            } else {
                g = gcd(prefix[i - 1], suffix[i + 1]);
            }
            ans = Math.max(ans, g);
        }
        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
