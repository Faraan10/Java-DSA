package recursion;

public class PrintIncreasing{

    // TC: O(N)
    // SC: O(N) stack space used

    public static void print(int N){

        if(N==1){
            System.out.print(1+" ");
            return;
        }

        print(N-1);
        System.out.print(N+" ");
    }
    public static void solve(int A){

        print(5);
        
    }

    public static void main(String[] args){

        solve(5);
    }
}