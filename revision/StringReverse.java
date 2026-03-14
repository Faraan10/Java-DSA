package revision;

public class StringReverse {
    
    // TC: O(N)
    // SC: O(1)
    // Dry run this approach
    public String solve(String A) {

        int N=A.length();
        StringBuilder sb=new StringBuilder();

        for(int i=N-1; i>=0; i--){

            // here it will loop till there are empty spaces if letter found stops
            while(i>=0 && A.charAt(i)==' '){
                i--;
            }
            // if i <0 breaks here else out of bounds exception
            if(i<0){
                break;
            }

            // first getting end pointer
            int end=i;
            // now going again till where this string ends till we not get
            // empty space as then i+1 will be start point of string
            while(i>=0 && A.charAt(i)!=' '){
                i--;
            }
            // taking that start point
            int start=i+1;

            // as after first string we should add empty space
            if(sb.length()>0){
                sb.append(' ');
            }
            // appending string by using substring method 
            sb.append(A.substring(start, end+1));
        }

        return sb.toString();
    }
}
