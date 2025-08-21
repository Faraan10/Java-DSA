package arrays;

public class kadenesAlgorithm {
    // TC: O(N)
    // SC: O(1)
    // public int maxSubArray(final int[] A) {

    //     int N=A.length;
    //     int ans=Integer.MIN_VALUE;
    //     int sum=0;

    //     for(int i=0; i<N; i++){
    //         if(sum<0){
    //             sum=0;
    //         }
    //         sum+=A[i];
    //         if(sum>ans){
    //             ans=sum;
    //         }
    //     }
    //     return ans;
    // }


    // in the below approach I am also including start and end 
    // index of the subarray
    public int[] maxSubArray(int[] arr){
        
        int temp_start=0;
        int start_idx=0;
        int end_idx=0;
        int sum=Integer.MIN_VALUE;
        int ans=0;
        int N=arr.length;
        int[] array=new int[3];

        for(int i=0; i<N; i++){

            if(ans<=0){
                ans=0;
                temp_start=i;
            }
            ans+=arr[i];
            if(ans>sum){
                sum=ans;
                start_idx=temp_start;
                end_idx=i;
            }
        }
        array[0]=start_idx;
        array[1]=end_idx;
        array[2]=sum;

        return array;
    }
}
