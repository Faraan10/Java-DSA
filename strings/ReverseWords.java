package strings;

public class ReverseWords {

    // Example Input

    // Input 1:
    // A = "the sky is blue"
    // Input 2:
    // A = "this is ib"

    // Example Output

    // Output 1:
    // "blue is sky the"
    // Output 2:
    // "ib is this"
    
    // NOTE:
    // A sequence of non-space characters constitutes a word.
    // Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
    // If there are multiple spaces between words, reduce them to a single space in the reversed string.
    
    
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



    // optimized string builder ( without additional string builder and without reverse method)
    // TC: O(N) 
    // SC: O(1) ( only stringBuilder for creating new string ) which is the output

    public String optimizedSolve(String A) {

        int N=A.length();        
        StringBuilder sb=new StringBuilder();

        for(int i=N-1; i>=0; i--){

            while(i>=0 && A.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }

            int end=i;

            while(i>=0 && A.charAt(i)!=' '){
                i--;
            }
            
            int start=i+1;

            if(sb.length()>0){
                sb.append(' ');
            }


            sb.append(A.substring(start, end+1));
        }
        return sb.toString();
    }
}
