package revision;


// Problem

// Given an array A of positive integers and an integer K, find the 
// length of the longest subarray whose sum ≤ K.

// Example
// A = [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
// K = 8

// Output:

// 3

// Constraints
// 1 ≤ N ≤ 10^5
// 1 ≤ A[i] ≤ 10^5
// 1 ≤ K ≤ 10^9
public class SubArraySum {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A, int K){

        int N=A.length;
        int left=0;
        long sum=0;
        int length=0;

        for(int right=0; right<N; right++){

            sum+=A[right];

            while(sum>K && left<=right){
                sum=sum-A[left];
                left++;
            }

            length=Math.max(length, right-left+1); 
        }
        return length;
    }
}
