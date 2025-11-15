package strings;

public class DiverseCharacters {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(final String A) {

        int N=A.length();
        int alphaCount=0;
        int numCount=0;

        for(int i=0; i<N; i++){

            char ch=A.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){ // or if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) because char stores vlaues as int only internally
                alphaCount++;
            }else{
                numCount++;
            }
        }
        return Math.max(alphaCount, numCount);
    }
}
