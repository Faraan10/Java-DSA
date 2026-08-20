package stacks;

import java.util.Stack;

public class InfixToPostfix {
    
    // TC: O(N)
    // SC: O(N) 
    public String solve(String A) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            // Operand
            if (Character.isLowerCase(ch)) {
                ans.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }

                // Remove '('
                stack.pop();
            }

            // Operator
            else {
                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(stack.peek()) >= precedence(ch)) {
                    ans.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Empty remaining operators
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    private int precedence(char ch) {
        if (ch == '^') {
            return 3;
        }

        if (ch == '*' || ch == '/') {
            return 2;
        }

        return 1; // + or -
    }
}
