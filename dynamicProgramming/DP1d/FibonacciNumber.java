package dynamicProgramming.DP1d;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    
    // There are 2 types of DP solutions -> 1) Memoization 2) Tabulation
    // this below is the Memoization method storing values in array as cache
    // and reusing them also called as top down approach

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


    // This below is the Tabulation method
    // using previous smaller subproblems solving the larger answer

    // TC: O(N)
    // SC: O(1)
    public static void mains(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        if(N==0){
            System.out.println(0);
        }
        if(N==1){
            System.out.println(1);
        }

        int a=0;
        int b=1;
        int c=0;
        for(int i=2; i<=N; i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
        sc.close();
    }
}
