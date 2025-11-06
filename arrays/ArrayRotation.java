package arrays;

public class ArrayRotation {
    
    public int[] solve(int[] A, int B) {

        int N=A.length;
        B=B%N;

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
