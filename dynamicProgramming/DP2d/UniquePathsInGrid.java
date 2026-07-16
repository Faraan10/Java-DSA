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



    // this is bottomup approach with tabulation dp array
    // TC: O(N*M)
    // SC: O(N*M)
    public int uniquePathsWithObstaclesBottomUp(int[][] A) {

        int N=A.length;
        int M=A[0].length;

        // as this is an obstacle the first index so we directly return 0 as
        // we can traverse further 
        // this below is based on the problem constraints 
        if(A[0][0]==1){
            return 0;
        }
        int[][] dp=new int[N][M];
        dp[0][0]=1;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                
                if(i==0 && j==0){
                    continue;
                }

                if(A[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }

                int top=0;
                int left=0;

                if(i>0){
                    top=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }

                dp[i][j]=top+left;
            }
        }
        return dp[N-1][M-1];
    }

}
