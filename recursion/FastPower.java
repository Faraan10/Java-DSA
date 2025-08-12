package recursion;

public class FastPower {
    // TC: O(log N)  every time we divide it by 2 so N/2, N/4, N/8... 
    // So, O(lon N) will reach 1 after about logN steps
    // SC: O(N) recursion stack space
    public long power(int A, int B) {

        if(B==0){
            return 1;
        }

        if(B%2==0){
            return power(A, B/2)* power(A, B/2);
        }
        return power(A, B/2) * power(A, B/2) * A;
    }
}
