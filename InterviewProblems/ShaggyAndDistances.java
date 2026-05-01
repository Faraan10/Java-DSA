package InterviewProblems;

import java.util.HashMap;

public class ShaggyAndDistances {


    // TC: O(N)
    // SC: O(N)
    public int solve(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {

            if (map.containsKey(A[i])) {
                int prevIndex = map.get(A[i]);
                minDist = Math.min(minDist, i - prevIndex);
            }

            // update latest index
            map.put(A[i], i);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
