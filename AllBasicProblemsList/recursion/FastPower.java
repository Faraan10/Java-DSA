package AllBasicProblemsList.recursion;

public class FastPower {
    
    // TC: O(N)
    // SC: O(N)
    public long power(int A, int B) {

        if(A==0 || A==1){
            return A;
        }
        if(B==0){
            return 1;
        }

        long half=power(A, B/2);
        if(B%2==0){
            return half*half;
        }else{
            return half*half*A;
        }
    }
}
