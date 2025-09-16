package stacks;

import java.util.Stack;

public class DoubleCharacterTrouble{

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
        sb.reverse();
        return sb.toString();
    }
}