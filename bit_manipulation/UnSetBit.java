package bit_manipulation;

public class UnSetBit{
    public int solve(int A, int B) {
        
        int ans=(A&(1<<B));

        if(ans!=0){
            A=A^(1<<B);
        }
        return A;
    }
}