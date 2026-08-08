package mathsAndCombinatorics;

public class consecutiveNumbersSum {
    
    // TC: O(root A)
    // SC: O(1)
    public int solve(int A) {

        int count = 0;

        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                // i is a divisor
                if (i % 2 == 1) count++;

                int other = A / i;
                if (other != i && other % 2 == 1) count++;
            }
        }

        return count;
    }
}
