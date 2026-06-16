package AbasicProblemsList.Strings;

public class ToggleCase {
    
    // TC: O(N^2) // because everytime we create new string 
    // when appening characters so loop O(N) and string 
    // creation O(N)
    // SC: O(1)
    public String solve(String A) {

        int N=A.length();
        String str="";

        for(int i=0; i<N; i++){
            char ch=A.charAt(i);
            if(ch>='a' && ch<='z'){
                str=str+(char)(ch-32);
            }else{
                str=str+(char)(ch+32);
            }
        }
        return str;
    }
}
