package stacks;

import java.util.Stack;

public class BalancedParenthesis {
    // TC: O(N)
    // SC: O(N) using stack data structure
    public int solve(String A) {

        int N=A.length();
        Stack<Character> st=new Stack<>();

        int i=0;
        while(i<N){

            if(opening(A.charAt(i))){
                st.push(A.charAt(i));
            }else{
                if(st.isEmpty()){
                    return 0;
                }
                char peek=st.peek();
                if(closing(peek, A.charAt(i))){
                    st.pop();
                }else{
                    return 0;
                }
            }
            i++;
        }

        if(st.isEmpty()){
            return 1;
        }
        return 0;
    }

    public static boolean opening(char A){

        if(A=='{'){
            return true;
        }else if(A=='['){
            return true;
        }else if(A=='('){
            return true;
        }else{
            return false;
        }
    }

    public static boolean closing(char peek, char A){

        if(peek=='[' && A==']'){
            return true;
        }else if( peek=='{' && A=='}'){
            return true;
        }else if(peek=='(' && A==')'){
            return true;
        }else{
            return false;
        }
    }
}
