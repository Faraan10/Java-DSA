package AllBasicProblemsList.ImportantProblems;

import java.util.Stack;

public class DoubleCharacterTrouble {
    
    public String solve(String A) {

        int N=A.length();
        Stack<Character> st=new Stack<>();
        st.push(A.charAt(0));

        for(int i=1; i<N; i++){
            if(!st.isEmpty() && A.charAt(i)==st.peek()){
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
