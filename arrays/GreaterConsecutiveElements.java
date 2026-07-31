package arrays;

public class GreaterConsecutiveElements {
    
    // TC: O(N)
    // SC: O(1)
    public static long countGreaterNumbers(int[] arr) {
        if (arr.length == 0) return 0;

        long count = 1;
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }

        return count;
    }
}
