package knapsack;

import java.util.Arrays;
import java.util.HashMap;

public class LengthOfLongestFibonacciSubsequence {

    // TC: O(N^2)
    // SC: O(N^2)
    public int solve(int[] A) {
    
        int n = A.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(A[i], i);
        }

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], 2);
        }

        int ans = 0;

        for (int k = 0; k < n; k++) {

            for (int j = k + 1; j < n; j++) {

                int prev = A[j] - A[k];

                if (prev < A[k] && map.containsKey(prev)) {

                    int i = map.get(prev);
                    dp[k][j] = dp[i][k] + 1;
                }

                ans = Math.max(ans, dp[k][j]);
            }
        }

        return ans >= 3 ? ans : 0;
    }
}
