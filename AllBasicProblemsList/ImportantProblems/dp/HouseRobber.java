package AllBasicProblemsList.ImportantProblems.dp;

import java.util.Arrays;

public class HouseRobber {
    
    // TC: O(N)
    // SC: O(N)
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
}
