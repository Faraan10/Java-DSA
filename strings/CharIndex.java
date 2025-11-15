package strings;

public class CharIndex {

// Example Input
// Input 1:
// 'anagram'

// Example Output
// Output 1:
// a1n14a1g7r18a1m13
    
    // optimized approach
    // TC: O(N)
    // SC: O(N) using string builder  
    public String solve(String A) {
       
       int N=A.length();
       StringBuilder sb=new StringBuilder();

       for(int i=0; i<N; i++){
           sb.append(A.charAt(i));
           sb.append(A.charAt(i)-'a'+1);
       }
       return sb.toString();
    }
}
