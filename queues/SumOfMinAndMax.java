package queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SumOfMinAndMax {
    
    // TC: O(N)
    // SC: O(B)
    public int solve(int[] A, int B) {

        int n = A.length;
        long MOD = 1000000007L;

        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();

        long ans = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements outside the current window
            while (!minDeque.isEmpty() && minDeque.peekFirst() <= i - B) {
                minDeque.pollFirst();
            }

            while (!maxDeque.isEmpty() && maxDeque.peekFirst() <= i - B) {
                maxDeque.pollFirst();
            }

            // Maintain increasing deque for minimum
            while (!minDeque.isEmpty() && A[minDeque.peekLast()] >= A[i]) {
                minDeque.pollLast();
            }

            // Maintain decreasing deque for maximum
            while (!maxDeque.isEmpty() && A[maxDeque.peekLast()] <= A[i]) {
                maxDeque.pollLast();
            }

            minDeque.offerLast(i);
            maxDeque.offerLast(i);

            // Once we have a complete window
            if (i >= B - 1) {
                long min = A[minDeque.peekFirst()];
                long max = A[maxDeque.peekFirst()];

                ans = (ans + min + max) % MOD;
            }
        }

        // Java can return negative modulo values
        if (ans < 0) {
            ans += MOD;
        }

        return (int) ans;
    }
}
