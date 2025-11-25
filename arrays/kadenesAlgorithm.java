package arrays;

public class kadenesAlgorithm {

    // TC: O(N)
    // SC: O(1)
    public int maxSubArraySum(final int[] A) {

        int N=A.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<N; i++){
            sum+=A[i];
            ans=Math.max(ans, sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }


    // in the below approach I am also including start and end 
    // indices of that subarray
    // TC: O(N)
    // SC: O(1)
    public int[] maxSubArray(final int[] A) {

        int[] arr=new int[3];
        int N=A.length;
        int ans=A[0];
        int sum=0;
        
        int start=0;
        int end=0;
        int startPoint=0;
        for(int i=0; i<N; i++){

            if (A[i] > ans) {
                ans = A[i];
                startPoint = i;
                end = i;
            }

            sum+=A[i];
            if(sum>ans){
                ans=sum;
                startPoint=start;
                end=i;
            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }

        arr[0]=startPoint;
        arr[1]=end;
        arr[2]=ans;

        return arr;
    }
}
