package hashing;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public int solve(int[] A) {

         int N = A.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        // prefix sum 0 occurs before array starts
        hm.put(0, -1);

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
