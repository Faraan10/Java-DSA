package AllBasicProblemsList.ImportantProblems.dp;

import java.util.Arrays;

public class HouseRobber {
    
    // TC: O(N)
    // SC: O(N)
    // Top down approach (recursive approach) with DP Memoization
    public int rob(int[] nums) {

        int N=nums.length;
        int[] dp=new int[N];
        Arrays.fill(dp, -1);

        int ans=solve(dp, nums, N-1);

        return ans;
    }

    public int solve(int[] dp, int[] nums, int i){

        if(i==0){
            return nums[0];
        }
        if(i==1){
            return Math.max(nums[0], nums[1]);
        }

        if(dp[i] != -1){
            return dp[i];
        }
        int ans=Math.max((nums[i]+solve(dp, nums, i-2)), solve(dp, nums, i-1));

        dp[i]=ans;
        return dp[i];
    }


    // TC: O(N)
    // SC: O(1)
    // Bottom up approach (iterative approach) with DP tabulation
    public int robItr(int[] nums) {
        
        int N=nums.length;
        if(N==0){
            return 0;
        }

        if(N==1){
            return nums[0];
        }

        int[] dp=new int[N];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);

        for(int i=2; i<N; i++){
            dp[i]=Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        return dp[N-1];
    }
}
