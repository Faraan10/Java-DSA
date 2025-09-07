package BinarySearch;

public class MaxHeightOfStaircase {
    
    // TC: O(log N)
    // SC: O(1)
    public int solve(int A) {

        long low=1;
        long high=A;
        long ans=0;

        while(low<=high){

            long mid=low+(high-low)/2;

            if((mid*(mid+1)/2)<=A){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)ans;
    }
}
