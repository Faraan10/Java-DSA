package recursion;

public class Factorial {
    // TC: O(N)
    // SC: O(N) as stack space is used in recursion
    public int solve(int A) {

        if(A==1){
            return 1;
        }
        return A*solve(A-1);
    }
}
