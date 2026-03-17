package revision;

public class RecursionFactotial {
    
    // TC: O(A)
    // SC: O(A) stack sace used by recursion
    public int fact(int A){

        if(A==1){
            return 1;
        }

        return fact(A-1)*A;
    }
}
