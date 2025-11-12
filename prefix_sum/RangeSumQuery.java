package prefix_sum;

public class RangeSumQuery {
    
    public long[] rangeSum(int[] A, int[][] B) {

        long[] arr=new long[B.length];

        for(int i=0; i<B.length; i++){
            
            int start=B[i][0];
            int end=B[i][1];
            long sum=0;
            for(int j=start; j<=end; j++){
                sum+=A[j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}
