package BinarySearch;

import java.util.Arrays;

public class AggresiveCows {
    
    
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
        int low=1;
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
}
