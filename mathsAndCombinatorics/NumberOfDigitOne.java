package mathsAndCombinatorics;

public class NumberOfDigitOne {
    
    // TC: O(log A)
    // SC: O(1)
    public int solve(int A) {

        long count = 0;

        for (long factor = 1; factor <= A; factor *= 10) {

            long low = A % factor;
            long current = (A / factor) % 10;
            long high = A / (factor * 10);

            if (current == 0) {
                count += high * factor;
            } 
            else if (current == 1) {
                count += high * factor + low + 1;
            } 
            else {
                count += (high + 1) * factor;
            }
        }

        return (int) count;
    }
}
