package arrays;

public class NestPermutation {
    
    // TC: O(N)
    // SC: O(1) no extra space used
    public static int[] reverse(int[] arr, int start, int end){

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

        // step 1: finding the first smaller element from right and storing its index
        for(int i=N-1; i>=1; i--){
            if(A[i]>A[i-1]){
                index=i-1;
                break;
            }
        }

        // step:2 reversing whole array in ascending order if no element is smaller than A[i] from right
        // as per problem requirement
        if(index==-1){
            reverse(A, 0, N-1);
            return A;
        }

        // step 3: Now from last to the index greater than the smaller element
        // if last element is greater than before element then swap and break 
        for(int i=N-1; i>index; i--){
            if(A[i]>A[index]){
                int temp=A[i];
                A[i]=A[index];
                A[index]=temp;
                break;
            }
        }
        // step 4: reverse the array from index+1 to get the req output
        reverse(A, index+1, N-1);

        return A;
    }
}
