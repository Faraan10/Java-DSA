package arrays;

public class ArrayRotation {
    
    // TC: O(N)
    // SC: O(1)
    public int[] solve(int[] A, int B) {

        int N=A.length;
        B=B%N; // using this B=B%N so that the number will come in less range
        // but will have same numbers when done with B 

        reverse(A, 0, N-1);
        reverse(A, 0, B-1);
        reverse(A, B, N-1);

        return A;        
    }

    int[] reverse(int[] arr, int i, int j){

        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
