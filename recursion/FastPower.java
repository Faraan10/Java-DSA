package recursion;

public class FastPower {
    // TC: O(log B)  every time we divide it by 2 so N/2, N/4, N/8... 
    // So, O(log B) will reach 1 after about logN steps
    // SC: O(log B) recursion stack space
    public long power(int A, int B) {

        if(B==0){
            return 1;
        }

        // by using this below variable we will be computing the value 
        // only once and use it inside the return recursive statements
        // avoiding repetitive calls so TC: O(log B) 
        long half= power(A, B/2);

        // if B is even then just multiplying 2 halves
        if(B%2==0){
            return half * half;
        }
        // else if B is odd we have to multiply by A one more time
        return half * half * A;
    }
}
