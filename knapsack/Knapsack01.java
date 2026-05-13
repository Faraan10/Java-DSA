package knapsack;

import java.util.Arrays;

public class Knapsack01 {
    
    int[][] dp;

    public int solve(int[] A, int[] B, int C) {

         int N = A.length;

        dp = new int[N][C + 1];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        return knapsack(A, B, C, 0);
    }

    public int knapsack(int[] A, int[] B,
                        int capacity, int i) {

        if (i == A.length) {
            return 0;
        }

        if (dp[i][capacity] != -1) {
            return dp[i][capacity];
        }

        int notTake =
            knapsack(A, B, capacity, i + 1);

        int take = 0;

        if (B[i] <= capacity) {
            take = A[i] +
                   knapsack(A, B,
                            capacity - B[i],
                            i + 1);
        }

        return dp[i][capacity] =
               Math.max(take, notTake);
    }
}
