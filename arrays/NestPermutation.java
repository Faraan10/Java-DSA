package arrays;

public class NestPermutation {
    
    public int[] reverse(int[] arr, int start, int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public int[] nextPermutation(int[] A) {

        
        int N=A.length;
        int index=-1;

        for(int i=N-2; i>=0; i--){
            if(A[i]<A[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
            reverse(A, 0, N-1);
            return A;
        }

        for(int i=N-1; i>index; i--){
            if(A[i]>A[index]){
                int temp=A[i];
                A[i]=A[index];
                A[index]=temp;
                break;
            }
        }
        reverse(A, index+1, N-1);
        return A;
    }
}
