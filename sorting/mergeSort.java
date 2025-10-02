package sorting;

public class mergeSort {
    
    public int[] solve(int[] A) {

        if(A==null || A.length<=1){
            return A;
        }
        return mergeSortFunction(A, 0, A.length-1);
    }

    public static int[] mergeSortFunction(int[] arr, int start, int end){

        if (start == end) return new int[]{arr[start]};

        int mid=start+(end-start)/2;

        int[] left=mergeSortFunction(arr, start, mid);
        int[] right=mergeSortFunction(arr, mid+1, end);

        return mergeSortedArrays(left, right);
    }

    public static int[] mergeSortedArrays(int[] A, int[] B){

        int N=A.length;
        int M=B.length;

        int[] arr=new int[N+M];
        
        int i=0; 
        int j=0;
        int k=0;
        while(i<N && j<M){
            if(A[i]<=B[j]){
                arr[k]=A[i];
                k++;
                i++;
            }else{
                arr[k]=B[j];
                k++;
                j++;
            }
        }

        while(i<N){
            arr[k]=A[i];
            k++;
            i++;
        }
        while(j<M){
            arr[k]=B[j];
            k++;
            j++;
        }
        return arr;
    }
}
