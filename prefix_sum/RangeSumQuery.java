package prefix_sum;

public class RangeSumQuery {
    
    // TC: O(B*A)
    // SC: O(1)
    // brute force approach
    // public long[] rangeSum(int[] A, int[][] B) {

    //     long[] arr=new long[B.length];

    //     for(int i=0; i<B.length; i++){
            
    //         int start=B[i][0];
    //         int end=B[i][1];
    //         long sum=0;
    //         for(int j=start; j<=end; j++){
    //             sum+=A[j];
    //         }
    //         arr[i]=sum;
    //     }
    //     return arr;
    // }


    // opotimzed using prefix sum approach
    
    public long[] rangeSum(int[] A, int[][] B) {

        int N=A.length;
        long[] arr=new long[N];
        arr[0]=A[0];
        for(int i=1; i<N; i++){
            arr[i]=arr[i-1]+A[i];
        }

        long[] ans=new long[B.length];

        for(int i=0; i<B.length; i++){
            int start=B[i][0];
            int end=B[i][1];

            if(start==0){
                ans[i]=arr[end];
            }else{
                ans[i]=arr[end]-arr[start-1];
            }
        }
        return ans;
    }
}
