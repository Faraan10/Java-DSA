package bit_manipulation;

public class SingleNumberThree {
    
    // TC: O(N) 2 for loops 2N = O(N)
    // SC: O(1) as no extra space used only an array returning it
    public int[] solve(int[] A) {

        int xorTotal = 0;

        // Step 1: XOR all elements
        for (int i = 0; i < A.length; i++) {
            xorTotal ^= A[i];
        }

        // Step 2: Find the rightmost set bit without using ~ or -
        int rightmostSetBit = 1;
        while ((xorTotal & rightmostSetBit) == 0) {
            rightmostSetBit = rightmostSetBit << 1;
        }

        // Step 3: Divide into two groups and XOR to find unique numbers
        int x = 0, y = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & rightmostSetBit) != 0) {
                x ^= A[i];
            } else {
                y ^= A[i];
            }
        }

        // Step 4: Return the result in ascending order
        int[] result={x,y};
        if(result[0]>result[1]){
            int temp=result[0];
            result[0]=result[1];
            result[1]=temp;
        }
        return result;
    }
}
