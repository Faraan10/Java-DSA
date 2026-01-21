package stacks;

import java.util.Stack;

public class DoubleCharacterTrouble{

    // TC: O(N) Iterating through the string once 
    // SC: O(N) using stack
    public String solve(String A){

        int N=A.length();

        Stack<Character> st=new Stack<>();

        for(int i=0; i<N; i++){
            if(!st.isEmpty() && st.peek()== A.charAt(i)){
                st.pop();
            }else{
                st.push(A.charAt(i));
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString(); // we have to reverse first as removing from stack gives opposite order
    }
}