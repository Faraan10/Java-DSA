package BinarySearch;

public class SortedInsertPosition {
    
    // TC: O(logN) as we are dividing the array by 2 every time 
    // SC: O(1) no extra space used
    public int searchInsert(int[] A, int B) {

        int value=A.length;

        int l=0;
        int r=A.length-1;

        while(l<=r){

            int mid=l+(r-l)/2;

            if(A[mid]==B){
                return mid;
            }else if(A[mid]>B){
                value=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return value;
    }
}
