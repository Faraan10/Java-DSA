package hashing;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
    // TC: O(N)
    // SC: O(N)
    public int solve(int[] A) {

          int N = A.length;
    long sum = 0;
    int maxLen = 0;

    HashMap<Long, Integer> hm = new HashMap<>();

    // prefix sum 0 before array starts
    hm.put(0L, -1);

    for (int i = 0; i < N; i++) {
        sum += A[i];

        if (hm.containsKey(sum)) {
            int prevIndex = hm.get(sum);
            maxLen = Math.max(maxLen, i - prevIndex);
        } else {
            // store first occurrence only
            hm.put(sum, i);
        }
    }

    return maxLen;
    }
}
