package recursion;

public class FastPower {
    
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
