package AllBasicProblemsList.recursion;

public class SumOfDigits {
    
    // TC: O(N)
    // SC: O(N)
    public int solve(int A) {
        
        int ans=calculate(A);
        return ans;
    }

    public int calculate(int N){

        if(N<=9){
            return N;
        }

        return N%10+calculate(N/10);
    }
}
