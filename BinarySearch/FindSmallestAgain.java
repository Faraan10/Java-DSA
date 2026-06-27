package BinarySearch;

import java.util.Arrays;

public class FindSmallestAgain {
    
    public int solve(int[] A, int B) {

         Arrays.sort(A);

        int n = A.length;

        int low = A[0] + A[1] + A[2];
        int high = A[n-1] + A[n-2] + A[n-3];

        int ans = high;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(count(A, mid) >= B){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private long count(int[] A, int limit){

    int n = A.length;
    long cnt = 0;

    for(int i=0;i<n-2;i++){

        int left = i+1;
        int right = n-1;

        while(left < right){

            int sum = A[i] + A[left] + A[right];

            if(sum <= limit){
                cnt += (right-left);
                left++;
            }else{
                right--;
            }
        }
    }

    return cnt;
}
}
