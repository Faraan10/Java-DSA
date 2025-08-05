package recursion;

public class Factorial {
    // TC: O(N)
    public int solve(int A) {

        if(A==1){
            return 1;
        }
        return A*solve(A-1);
    }
}
