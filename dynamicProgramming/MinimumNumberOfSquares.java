package dynamicProgramming;

import java.util.Arrays;

public class MinimumNumberOfSquares {
    
    // TC: O(N root N)
    // SC: O(N)
    public int countMinSquares(int A) {

        int[] dp=new int[A+1];
        Arrays.fill(dp, -1);

        int ans=solve(A, dp);
        return ans;
    }

    public int solve(int N, int[] dp){

        if(N==0) return 0;

        if(dp[N] != -1){
            return dp[N];
        }
        
        int ans=Integer.MAX_VALUE;

        for(int i=1; i*i<=N; i++){
            
            int square=i*i;
            ans=Math.min(ans, solve(N-square, dp)+1);
        }
        dp[N]=ans;

        return dp[N];
    }
}
