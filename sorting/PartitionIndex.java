package sorting;

public class PartitionIndex {
    
    // TC: O(N) 
    // SC: O(1)
    public int partition(int[] arr){

        int N=arr.length;
        int i=-1; // this is the index partition point where all the elements
        // till here are <=pivot and after here will be greater than pivot
        int pivot=arr[N-1]; // this is the pivot element we do not alter this 
        // till final step and do checks just before it

        for(int j=0; j<N-1; j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[N-1];
        arr[N-1]=temp;

        return i+1; // this is the partition index where before are element<= 
        // and after index elements > greater
    }
}
