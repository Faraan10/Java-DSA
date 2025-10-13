package backtracking;

import java.util.ArrayList;

public class Permutations {
    
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[A.size()]; // Track which elements are used
        backtrack(A, new ArrayList<>(), used, result);
        return result;
    }

    public static void backtrack(ArrayList<Integer> A, ArrayList<Integer> current, boolean[] used, ArrayList<ArrayList<Integer>> result) {
        // Base case - when we have a complete permutation
        if (current.size() == A.size()) {
            result.add(new ArrayList<>(current)); // Add a copy of the current permutation
            return;
        }

        // Try placing each number in the current permutation
        for (int i = 0; i < A.size(); i++) {
            if (used[i]) continue; // Skip already used numbers

            // Choose
            used[i] = true;
            current.add(A.get(i));

            // Explore
            backtrack(A, current, used, result);

            // Un-choose (backtrack)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
