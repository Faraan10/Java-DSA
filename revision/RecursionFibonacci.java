package revision;

public class RecursionFibonacci {
    
    // TC: O(2 power N) as it recalculates the sum several times in recursion
    // SC: O(N)
    public int fibonacci(int N){

        if(N==1 || N==0){
            return N;
        } 

        return fibonacci(N-1)+fibonacci(N-2);
    }
}
