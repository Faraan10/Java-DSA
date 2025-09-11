package stacks;

import java.util.Stack;

public class ReversePolishNotation {
    
    public int evalRPN(String[] A) {
        
        int N=A.length;
        Stack<Integer> st=new Stack<Integer>();

        int i=0;
        while(i<N){
            if(!(operators(A[i]))){
                st.push(Integer.parseInt(A[i]));
            }
            else{
                int second=st.pop();
                int first=st.pop();

                int evaluate=evalExpression(first, second, A[i]);
                st.push(evaluate);
            }
            i++;
        }
        return st.peek();
    }

    public static int evalExpression(int first, int second, String A){

            if(A.equals("*")){
                return first*second;
            }else if(A.equals("+")){
                return first+second;
            }else if(A.equals("/")){
                return first/second;
            }else{
                return first-second;
            }
        }

        public static boolean operators(String A){
            if(A.equals("*") || A.equals("/") || A.equals("-") || A.equals("+")){
                return true;
            }
            return false;
        }
}
