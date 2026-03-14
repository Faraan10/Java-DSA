package revision;

public class StringReverse {
    
    // TC: O(N)
    // SC: O(1)
    // Dry run this approach
    public String solve(String A) {

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
