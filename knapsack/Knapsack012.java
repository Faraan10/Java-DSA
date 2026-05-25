package knapsack;

import java.util.Arrays;

public class Knapsack012 {
    
    // TC: O(N^2)
    // SC: O(N)
    public int solve(int[] A, int[] B, int C) {

        int N = A.length;

        int maxValue = 0;

        for (int val : A) {
            maxValue += val;
        }

        long INF = (long)1e18;

        long[] dp = new long[maxValue + 1];

        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int i = 0; i < N; i++) {

            int value = A[i];
            int weight = B[i];

            // backward for 0-1 property
            for (int v = maxValue; v >= value; v--) {

                dp[v] = Math.min(
                    dp[v],
                    weight + dp[v - value]
                );
            }
        }

        // largest achievable value
        for (int v = maxValue; v >= 0; v--) {

            if (dp[v] <= C) {
                return v;
            }
        }

        return 0;
    }
}
