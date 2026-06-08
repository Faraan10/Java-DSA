package AbasicProblemsList;

public class SpecialSubsequences {
    
    // TC: O(N)
    // SC: O(1)
    public long solve(String A) {

        int N=A.length();
        int count=0;
        long sum=0;

        for(int i=0; i<N; i++){
            if(A.charAt(i)=='A'){
                count++;
            }else if(A.charAt(i)=='G'){
                sum+=count;
            }
        }
        return sum;
    }
}
