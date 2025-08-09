package recursion;

public class SumOfDigits {

    // TC: O(N)
    // SC: O(N) recursion stack
    public int sum(int N){

        if(N==0){
            return 0;
        }
        return sum(N/10)+N%10;

    }
    public int solve(int A) {

        return sum(A);
    }
}
