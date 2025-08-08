package recursion;

public class DecreasingIncreasing {
    // TC: O(N)
    // SC: O(N) stack space
    public void print(int N){

        if(N==0){
            return;
        }

        System.out.print(N+" ");
        print(N-1);
        System.out.print(N+" ");
    }

    public void DecThenInc(int A) {

        print(A);
        System.out.println();
    }
}
