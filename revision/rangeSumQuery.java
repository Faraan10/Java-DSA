package revision;

public class rangeSumQuery {
    
    // Note: The output is in long use long for prefix also it might overflow
    // TC: O(N+M)
    // SC: O(N)
    public long[] rangeSum(int[] A, int[][] B) {

        int N=A.length;
        long[] arr=new long[N];
        arr[0]=A[0];
        for(int i=1; i<N; i++){
            arr[i]=arr[i-1]+A[i];
        }

        int M=B.length;
        long[] array=new long[M];

        for(int i=0; i<M; i++){
            int start=B[i][0];
            int end=B[i][1];

            if(start==0){
                array[i]=arr[end];
            }else{
                array[i]=arr[end]-arr[start-1];
            }
        }
        return array;
    }
}
