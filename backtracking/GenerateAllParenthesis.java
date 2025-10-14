package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateAllParenthesis {
    
    // TC: O(C_A × A)
    // SC: O(A)
    public String[] generateParenthesis(int A) {

         List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, A);
        Collections.sort(result);
        return result.toArray(new String[0]);
    }

    public static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == 2 * max) {
            result.add(current);
            return;
        }

        if (open < max)
            backtrack(result, current + "(", open + 1, close, max);

        if (close < open)
            backtrack(result, current + ")", open, close + 1, max);
    }
}
