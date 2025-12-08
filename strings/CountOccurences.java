package strings;

// Q) Find the number of occurrences of bob in string A consisting of lowercase 
// English alphabets.

public class CountOccurences {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(String A) {

        int N=A.length();
        int count=0;

        int i=0;
        int j=2;
        while(j<N){
            if(A.substring(i, j+1).equals("bob")){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}
