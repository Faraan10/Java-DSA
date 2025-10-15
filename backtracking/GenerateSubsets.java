package backtracking;

import java.util.ArrayList;

    // TC: O(2^N * N)
    // SC: O(N)
public class GenerateSubsets {
    
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        // code here

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(A, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(ArrayList<Integer> A, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        // Add current subset to result
        result.add(new ArrayList<>(current));

        // Explore further elements
        for (int i = index; i < A.size(); i++) {
            current.add(A.get(i));              // Choose
            backtrack(A, i + 1, current, result); // Explore
            current.remove(current.size() - 1);   // Unchoose (backtrack)
        }
    }
}
