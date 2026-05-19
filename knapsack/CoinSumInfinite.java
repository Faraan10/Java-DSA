package knapsack;

public class CoinSumInfinite {
    
    // TC: O(N*B)
    // SC: O(B)

    // This is tabulation code 
    public int coinchange2(int[] A, int B) {

         int MOD = 1000007;

        long[] dp = new long[B + 1];

        dp[0] = 1;

        for (int coin : A) {

            for (int sum = coin; sum <= B; sum++) {

                dp[sum] =
                    (dp[sum] + dp[sum - coin]) % MOD;
            }
        }

        return (int)dp[B];
    }
}
