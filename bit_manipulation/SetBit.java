package bit_manipulation;

public class SetBit {
    // TC: O(N)
    // SC: O(1)
    public int solve(int A, int B) {

        int a=0;
        int b=0;
        for(int i=0; i<32; i++){
            a=1<<A;
            b=1<<B;
        }

        if(a==b){
            return a;
        }
        return a+b;
    }
}
