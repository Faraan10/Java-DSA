package recursion;

public class FirstIndex {
    public int FirstIndexRecur(int[] A, int B) {

        return findIndex(A, B, 0);
    }

     private int findIndex(int[] A, int B, int index) {
        // Base case: if we've checked all elements
        if (index == A.length) {
            return -1;
        }
        
        // If element found at current index
        if (A[index] == B) {
            return index;
        }
        
        // Recursive case: check the next index
        return findIndex(A, B, index + 1);
    }
}
