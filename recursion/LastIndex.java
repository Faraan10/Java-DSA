package recursion;

public class LastIndex {
    
    public int LastIndexFinder(int[] A, int B) {

        return helper(A, B, A.length-1);
    }

    public static int helper(int[] arr, int B, int N){

        if(N<0){
            return -1;
        }

        if(arr[N]==B){
            return N;
        }

        return helper(arr, B, N-1);
    }
}
