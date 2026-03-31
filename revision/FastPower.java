package revision;

public class FastPower {
    
    // TC: O(log B) as in each step it is divided by 2 so drastically 
    // reducing
    // SC: O(log B) same 
    public long power(int A, int B) {

        if(B==0){
            return 1L;
        }

        long half=power(A, B/2);
        if(B%2==0){
            return half * half;
        }
        return half * half * A;
    }
}
