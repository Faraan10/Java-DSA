package recursion;

public class MaxOfArray {
    
    // TC: O(N)
    // SC: O(N) stack space
    public int Max(int[] arr, int start, int end, int high){

        if(start>end){
            return high;
        }
        high=Math.max(high, arr[start]);
        return Max(arr, start+1, end, high);
    }

    public int getMax(int[] A) {

        return Max(A, 0, A.length-1, Integer.MIN_VALUE);
    }
}
