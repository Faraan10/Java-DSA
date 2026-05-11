package dynamicProgramming.DP1d;

import java.util.Arrays;

public class HouseRobber {

    // This is classic House robber problem (Leetcode 198)

    //You are a professional robber planning to rob houses along
    //  a street. Each house has a certain amount of money 
    // stashed, the only constraint stopping you from robbing 
    // each of them is that adjacent houses have security 
    // systems connected and it will automatically contact the 
    // police if two adjacent houses were broken into on the 
    // same night.

    // Given an integer array nums representing the amount of 
    // money of each house, return the maximum amount of money 
    // you can rob tonight without alerting the police.


    // TC: O(N)
    // SC: O(N)
    public int rob(int[] nums) {

        int N=nums.length;

        int[] dp=new int[N];
        Arrays.fill(dp, -1);

        return solve(nums, dp, N-1);
    }

    public int robSolve(int[] nums, int[] dp, int i){

        if(i<0){
            return 0;
        }

        if(i==0){
            return nums[0];
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int include=nums[i]+robSolve(nums, dp, i-2);
        int exclude=robSolve(nums, dp, i-1);

        dp[i]=Math.max(include, exclude);

        return dp[i];
    }
    
    // this below is problem Max Sum Without Adjacent Elements
    // Is house robber problem in disguise with 2d array
    // what we did below is as we want the max sum without 
    // adjacent elements we created a 1d array with the 2d array
    // by taking the max number from the first row and 
    // second row 
    // So then we get a 1d array wtih N elements then we can
    // apply classic house robber approach

    // TC: O(N)
    // SC: O(N)
    public int adjacent(int[][] A) {

        int N=A[0].length;
        int[] arr=new int[N];

        for(int i=0; i<N; i++){
            arr[i]=Math.max(A[0][i], A[1][i]);
        }

        int[] dp=new int[N];
        Arrays.fill(dp, -1);

        return solve(arr, dp, N-1);
    }

    public int solve(int[] arr, int[] dp, int i){

        if(i<0){
            return 0;
        }

        if(i==0){
            return arr[0]; 
        }
        
        if(dp[i] != -1){
            return dp[i];
        }

        int include=arr[i]+solve(arr, dp, i-2);
        int exclude=solve(arr, dp, i-1);

        dp[i]=Math.max(include, exclude);

        return dp[i];
    }
}
