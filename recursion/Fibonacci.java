package recursion;

public class Fibonacci {
    // TC: O(2 power N) because it recalculates the same sub problems many times
    // SC: O(N) recurison stack
    public int findAthFibonacci(int A) {

        if(A==0){
            return 0;
        }
        if(A==1){
            return 1;
        }
        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }
}
