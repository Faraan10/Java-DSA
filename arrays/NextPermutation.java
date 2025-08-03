package arrays;

public class NextPermutation {
    // TC: O(N)  2 while loops 2N ignoring constants so O(N)
    // SC: O(1)  as no additional space was used
    public int[] nextPermutation(int[] A) {

        int n = A.length;

    int i = n - 2;
    while (i >= 0 && A[i] >= A[i + 1]) {
        i--;
    }

    if (i >= 0) {
        int j = n - 1;
        while (A[j] <= A[i]) {
            j--;
        }

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    int start = i + 1;
    int end = n - 1;
    while (start < end) {
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
        start++;
        end--;
    }

    return A;
    }
}
