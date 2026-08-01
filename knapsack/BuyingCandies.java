package knapsack;

public class BuyingCandies {
    
    // TC: O(N*D)
    // SC: O(D)
    public int solve(int[] A, int[] B, int[] C, int D) {

        int[] dp = new int[D + 1];

        int n = A.length;

        for (int i = 0; i < n; i++) {
            int value = A[i] * B[i];

            for (int cost = C[i]; cost <= D; cost++) {
                dp[cost] = Math.max(dp[cost], dp[cost - C[i]] + value);
            }
        }

        return dp[D];
    }
}
