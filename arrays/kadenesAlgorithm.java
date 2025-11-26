package arrays;

public class kadenesAlgorithm {

    // kadenes algorithm simplified
    // TC: O(N)
    // SC: O(1)
    public int kadenesSolve(int[] arr){

        int N=arr.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<N; i++){
            sum=Math.max(arr[i], arr[i]+sum);
            ans=Math.max(ans, sum);
        }
        return ans;
    }

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

        int N=A.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int temp_start=-1;
        int end=-1;

        int[] array=new int[2];

        for(int i=0; i<N; i++){

            if(sum<=0){
                sum=0;
                temp_start=i;
            }
            sum+=A[i];
            if(sum>ans){
                start=temp_start;
                end=i;
                ans=sum;
            }
        }

        array[0]=start;
        array[1]=end;
        array[2]=ans;
        
        return array;
    }
}
