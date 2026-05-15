package knapsack;

public class UnboundKhapsack {
    
    public int solve(int A, int[] B, int[] C) {

         int N = B.length;

        int[] dp = new int[A + 1];

        for (int i = 0; i < N; i++) {

            int value = B[i];
            int weight = C[i];

            // FORWARD loop
            for (int cap = weight; cap <= A; cap++) {

                dp[cap] = Math.max(
                    dp[cap],
                    value + dp[cap - weight]
                );
            }
        }

        return dp[A];
    }
}
