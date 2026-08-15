package stacks;

import java.util.Stack;

public class RedundantBraces {
    
    // TC: O(N)
    // SC: O(N)
    public int braces(String A) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch == ')') {

                boolean operatorFound = false;

                while (st.peek() != '(') {

                    char top = st.pop();

                    if (top == '+' || top == '-' ||
                        top == '*' || top == '/') {

                        operatorFound = true;
                    }
                }

                // Remove '('
                st.pop();

                if (!operatorFound) {
                    return 1;
                }

            } else {
                st.push(ch);
            }
        }

        return 0;
    }
}
