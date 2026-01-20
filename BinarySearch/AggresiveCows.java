package BinarySearch;

import java.util.Arrays;

public class AggresiveCows {
    
    // TC: O(NlogN) using helper function which is iterating atmost N times
    // SC: O(1)
    public static boolean isPossible(int[] arr, int cowsNeeded, int distance){

        int cows=1;
        int last=arr[0];
        int N=arr.length;

        for(int i=1; i<N; i++){
            if(arr[i]-last >= distance){
                cows++;
                last=arr[i];
            }
            if(cows >= cowsNeeded){
                return true;
            }
        }
        return false;
    }
    public int solve(int[] A, int B) {

        Arrays.sort(A);
        int N=A.length;
        int low=1; // lowest ditance between 2 cows
        int ans=0;

        int high=A[N-1]-A[0]; // calculating highest distance

        while(low<=high){

            int mid=low+(high-low)/2;

            if(isPossible(A, B, mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }


    // same approach but with better explanation
    public boolean isPossibleToPlaceCows(int[] A, int min_length_to_place_cows, int cows_limit){

        int N=A.length;
        int count=1; // as placing 1st cow at first position
        int lastIndex=0; // for tracking previous cows position

        for(int i=1; i<N; i++){
            if(A[i]-A[lastIndex]>=min_length_to_place_cows){
                count++;
                lastIndex=i;
            }
            if(count>=cows_limit){
                return true;
            }
        }
        return false;
    }
    
    public int explainedSolve(int[] A, int B) {

        int N=A.length;
        // The array has to be sorted for this problem as we are comparing
        // every element stall wise side by side for distance so,

        Arrays.sort(A);
        int low=1; // this is the lowest dictance between any two cows
        int high=A[N-1]-A[0]; // this is the max distance btw any two cows
        // above both variables are required for search space which is required
        // for binary search
        int ans=-1;

        while(low<=high){

            int mid=low+(high-low)/2;
            
            if(isPossibleToPlaceCows(A, mid, B)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
