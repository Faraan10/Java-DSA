package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    
    // TC: O(N) reduces TC as we are doing memoization using array to store
    // already computated values so that we dont have to recompute again so 
    // we have N unique values once computed it just retuns the value instead
    // of recomputing again so we reduce TC from O(2^N) to O(N)
    
    // SC: O(N)  for the stack depth which is at most worst case O(N)
    public static int fib(int N, int[] dp){

        if(N==0 || N==1){
            return N;
        }

        if(dp[N] != -1){
            return dp[N];
        }

        dp[N]=fib(N-1, dp)+fib(N-2, dp);
        
        return dp[N];
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] dp=new int[N+1];
        Arrays.fill(dp, -1);

        int number=fib(N, dp);    
        System.out.println(number);
        sc.close();
    }
}
