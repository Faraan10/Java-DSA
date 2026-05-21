package knapsack;

public class CuttingRod {

    // TC: O(N^2)
    // SC: O(N)
    public int solve(int[] A) {

        int N = A.length;

        int[] dp = new int[N + 1];

        for (int len = 1; len <= N; len++) {

            for (int cut = 1; cut <= len; cut++) {

                dp[len] = Math.max(
                    dp[len],
                    A[cut - 1] + dp[len - cut]
                );
            }
        }

        return dp[N];
    }
}
