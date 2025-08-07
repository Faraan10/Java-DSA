package bit_manipulation;

public class SingleNumberTwo {
    public int singleNumber(final int[] A) {

        int result=0;
        // Go through each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int sum = 0;

            // Count the number of 1s at the i-th bit position across all numbers
            for (int num : A) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }

            // If count of 1s at bit i is not divisible by 3, set bit i in result
            if ((sum % 3) != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
