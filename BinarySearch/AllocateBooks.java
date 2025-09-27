package BinarySearch;

public class AllocateBooks {
    
    // TC: O(N* log(sum)) O(N) fro isPossible function and O(log(sum)) for binarysearch 
    // SC: O(1)
    public static boolean isPossible(int[] arr, int N, int B, int mid){

        int students=1;
        int pages=0;
        for(int i=0; i<N; i++){
            pages=pages+arr[i];
            if(pages>mid){
                pages=arr[i];
                students++;
            }
            if(students>B){
                return false;
            }
        }
        return true;
    }
    public int books(int[] A, int B) {

        if(A.length<B){
            return -1;
        }

        int N=A.length;
        int max=0;
        int sum=0;
        for(int i=0; i<N; i++){
            max=Math.max(max, A[i]);
            sum=sum+A[i];
        }

        int low=max;
        int high=sum;
        int ans=-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(isPossible(A, N, B, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
