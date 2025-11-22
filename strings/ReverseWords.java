package strings;

public class ReverseWords {
    
    // using stringbuilder
    // TC: O(N)
    // SC: O(N)
    public String solve(String A) {
        
        int N=A.length();
        
        StringBuilder sb=new StringBuilder();

        for(int i=N-1; i>=0; i--){

            StringBuilder str=new StringBuilder();
            if(A.charAt(i) != ' '){

                while(i>=0 && A.charAt(i)!=' '){
                    str.append(A.charAt(i));
                    i--;
                }
                if(sb.length()!=0){
                    sb.append(' ');
                }

                str.reverse();
                sb.append(str);

            }
        }
        return sb.toString();
    }
}
