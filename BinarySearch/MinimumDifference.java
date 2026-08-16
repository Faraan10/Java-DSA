package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDifference {
    
    // TC: O(N log N)
    // SC: O(1)
    public int solve(int A, int B, ArrayList<ArrayList<Integer>> C) {

        // Sort every row
    for (int i = 0; i < A; i++) {
        Collections.sort(C.get(i));
    }

    int ans = Integer.MAX_VALUE;

    // Compare every pair of consecutive rows
    for (int row = 0; row < A - 1; row++) {

        ArrayList<Integer> first = C.get(row);
        ArrayList<Integer> second = C.get(row + 1);

        int i = 0;
        int j = 0;

        while (i < B && j < B) {

            int diff = Math.abs(first.get(i) - second.get(j));
            ans = Math.min(ans, diff);

            // Cannot do better than 0
            if (ans == 0) {
                return 0;
            }

            if (first.get(i) < second.get(j)) {
                i++;
            } else {
                j++;
            }
        }
    }

    return ans;
    }
}
