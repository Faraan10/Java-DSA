package dynamicProgramming.DP2d;

import java.util.Arrays;

public class UniquePathsInGrid {
    
    // TC: O(N*M)
    // for space complexity recursion stack is N+M 
    // and also dp array N*M so,
    // SC: O(N*M)
    public int uniquePathsWithObstacles(int[][] A) {

        int N=A.length;
        int M=A[0].length;

        int[][] dp=new int[N][M];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return ways(A, dp, N-1, M-1);
    }
    
    public int ways(int[][] A, int[][] dp, int i, int j) {

        // if any index out of bounds
        if (i < 0 || j < 0) {
            return 0;
        }

        // if and Obstacle is there if matrix contains 1 return 0 
        if (A[i][j] == 1) {
            return 0;
        }

        // Source reached 
        if (i == 0 && j == 0) {
            return 1;
        }

        // Memoized
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = ways(A, dp, i - 1, j);

        int left = ways(A, dp, i, j - 1);

        dp[i][j] = up + left;

        return dp[i][j];
    }

}
