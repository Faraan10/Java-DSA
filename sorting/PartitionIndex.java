package sorting;

public class PartitionIndex {
    
    public int partition(int[] arr){

        int N=arr.length;
        int i=0;
        int j=0;
        int pivot=arr[N-1];

        while(i<N-1){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }

        int temp=arr[N-1];
        arr[N-1]=arr[j];
        arr[j]=temp;
        
        return j;
    }
}
