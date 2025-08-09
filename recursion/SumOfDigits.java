package recursion;

public class SumOfDigits {

    // TC: O(N) i.e: total no of functional calls * time taken by one function
    // SC: O(N) recursion stack  i.e: max depth taken by function calls * space per function call
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
