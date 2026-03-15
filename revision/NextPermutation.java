package revision;

public class NextPermutation {
    
    // TC: O(N)
    // SC: O(1) no extra space used

    // reversing array helper function
    public int[] reverseArray(int[] arr, int start, int end){

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
        int idx=-1;
        // first below finding the first smaller element on the left side 
        // because to get the next greater element we have to all combined
        // we have to modify this place with first greater element on the
        // right side and then reverse the array from i+1 position to get
        // the next greatest permutation of the array 
        // and if this does not exist return array in ascending order

        for(int i=N-2; i>=0; i--){
            if(A[i]<A[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverseArray(A, 0, N-1);
            return A;
        }

        for(int i=N-1; i>idx; i--){
            if(A[i]>A[idx]){
                int temp=A[i];
                A[i]=A[idx];
                A[idx]=temp;
                break;
            }
        }
        reverseArray(A, idx+1, N-1);
        return A;
    }
}
