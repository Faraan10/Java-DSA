package BinarySearch;

public class SearchInRange {
    // Bruteforce method
    // TC: O(N)
    // SC: O(1)
    public int[] searchRange(final int[] A, int B) {

        int N=A.length;
        int leftMost=-1;
        int rightMost=-1;
        for(int i=0; i<N; i++){
            if(A[i]==B){
                rightMost=i;
            }
        }

        for(int i=N-1; i>=0; i--){
            if(A[i]==B){
                leftMost=i;
            }
        }

        return new int[] {leftMost, rightMost};
    }

    
    public static int leftMostIndex(int[] arr, int K){

        int low=0;
        int high=arr.length-1;
        int leftMost=-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==K){
                leftMost=mid;
                high=mid-1;
            }else if(arr[mid]>K){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return leftMost;
    }

    public static int rightMostIndex(int[] arr, int K){

        int low=0;
        int high=arr.length-1;
        int rightMost=-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==K){
                rightMost=mid;
                low=mid+1;
            }else if(arr[mid]>K){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return rightMost;
    }

    public int[] searchInRange(final int[] A, int B) {

        int first=leftMostIndex(A, B);
        int last=rightMostIndex(A, B);

        return new int[] {first, last};
    }
}
