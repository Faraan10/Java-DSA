package arrays.subarraysAndCarryForward;

public class SubArrayInRange {
    

    public int[] solve(int[] A, int B, int C) {

        int[] arr=new int[C-B+1];

        for(int i=B; i<=C; i++){
            arr[i-B]=A[i];
        }
        return arr;
    }
}
