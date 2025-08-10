package bit_manipulation;

public class SubArrayZeroOrOne {

    // TC: O(N)
    // SC: O(1)
    public int subarraysWithOR1(int[] A) {

        int n = A.length;
        long total = (long) n * (n + 1) / 2;  // total subarrays

        long zeroSubarrays = 0;
        long zeroCount = 0;

        for (int num : A) {
            if (num == 0) {
                zeroCount++;
            } else {
                // end of zero block
                zeroSubarrays += zeroCount * (zeroCount + 1) / 2;
                zeroCount = 0;
            }
        }
        // last zero block if any
        zeroSubarrays += zeroCount * (zeroCount + 1) / 2;

        return (int) (total - zeroSubarrays);
    }
    
}
