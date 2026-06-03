package AbasicProblemsList;

public class PerfectNumbers {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int A) {

        int count=0;
        for(int i=1; i<A; i++){
            if(A%i==0){
                count+=i;
            }
        }
        if(count==A){
            return 1;
        }
        return 0;
    }
}
