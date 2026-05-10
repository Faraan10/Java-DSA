package dynamicProgramming.DP1d;

import java.util.Arrays;

public class ClimbingStairs {
    
    // TC: O(N)
    // SC: O(N)
    public int climbStairs(int A) {

        int[] dp=new int[A+1];
        Arrays.fill(dp, -1);
        int ans=solve(A, dp);

        return ans;
    }

    public int solve(int N, int[] dp){
        
        int MOD=1000000007;
        if(N<=1){
            return 1;
        }

        if(dp[N] != -1){
            return dp[N];
        }

        dp[N]=(solve(N-1, dp)+solve(N-2, dp))%MOD;

        return dp[N];
    }
}
