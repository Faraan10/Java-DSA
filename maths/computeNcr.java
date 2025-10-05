package maths;

public class computeNcr {
    
    public int solve(int A, int B, int C) {

        // dp[n][r] stores the value of nCr
        int[][] dp = new int[A + 1][B + 1];
        for(int i = 0; i <= A; i++) {
            for(int j = 0; j <= Math.min(i, B); j++) {
                if(j == i || j == 0) {
                    dp[i][j] = 1;
                } else {
                    // nCr = (n - 1)C(r - 1) + (n - 1)Cr
                    dp[i][j] = (dp[i - 1][j - 1] % C + dp[i - 1][j] % C) % C;
                }
            }
        }
        return dp[A][B] % C;
    }
}
