package recursion;

public class PrintDecrease {
    
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
