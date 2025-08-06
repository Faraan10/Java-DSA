package recursion;

public class PrintDecrease {

    // TC: O(N)
    // SC: O(N) recursion uses stack space
    public static void print(int N){

        if(N==0){
            return;
        }

        System.out.print(N+" ");
        print(N-1);
    }

    public static void solve(int A){

        print(A);
    }

    public static void main(String[] args){

        solve(5);
    }
}
