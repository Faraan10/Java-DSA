package stacks;

import java.util.Stack;

public class CheckTwoBracketExpression {
    
    // TC: O(N)
    // SC: O(N)
    public int solve(String A, String B) {

        int[] signA = getSigns(A);
        int[] signB = getSigns(B);

        for (int i = 0; i < 26; i++) {
            if (signA[i] != signB[i]) {
                return 0;
            }
        }

        return 1;
    }

    private int[] getSigns(String s) {
        int[] result = new int[26];

        Stack<Integer> stack = new Stack<>();
        stack.push(1); // positive initially

        int currentSign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '+') {
                currentSign = 1;
            }
            else if (ch == '-') {
                currentSign = -1;
            }
            else if (ch == '(') {
                stack.push(stack.peek() * currentSign);
                currentSign = 1;
            }
            else if (ch == ')') {
                stack.pop();
            }
            else {
                // operand
                int index = ch - 'a';
                result[index] = stack.peek() * currentSign;
                currentSign = 1;
            }
        }
        return result;
    }
}
