package sorting;

public class QuickSort {
    
    public int partition(int[] arr, int s, int e){

        int pivot=arr[e];
        int i=s-1;

        for(int j=s; j<e; j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;

        return i+1;
    }

    public void quickSort(int[] arr, int s, int e){

        if(s>=e){
            return;
        }

        int pIndex=partition(arr, s, e);

        quickSort(arr, s, pIndex-1);
        quickSort(arr, pIndex+1, e);
    }

    public int[] solve(int[] A) {

        quickSort(A, 0, A.length-1);

        return A;
    }
}
