package AllBasicProblemsList.Strings;

public class ReverseString {

    // You are given a string A of size N.

    // Return the string A after reversing the string word by word.

    // NOTE:

    // A sequence of non-space characters constitutes a word.
    // Your reversed string should not contain leading or 
    // trailing spaces, even if it is present in the input string.
    // If there are multiple spaces between words, reduce 
    // them to a single space in the reversed string.
    
    public String solve(String A) {

        int N=A.length();
        StringBuilder sb=new StringBuilder();

        for(int i=N-1; i>=0; i--){

            while(i>=0 && A.charAt(i)== ' '){
                i--;
            }
            if(i<0){
                break;
            }
            int end=i;
            while(i>=0 && A.charAt(i) != ' '){
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
