public class DistributeCandy {
    
    // TC: O(N)
    // SC: O(N)
    public int candy(int[] A) {

        int N=A.length;
        int[] left=new int[N];
        int[] right=new int[N];
        left[0]=1;
        for(int i=1; i<N; i++){
            if(A[i-1]<A[i]){
                left[i]=left[i-1]+1;
            }else{
                left[i]=1;
            }
        }

        right[N-1]=1;
        for(int i=N-2; i>=0; i--){
            if(A[i]>A[i+1]){
                right[i]=right[i+1]+1;
            }else{
                right[i]=1;
            }
        }

        long sum=0;
        for(int i=0; i<N; i++){
            sum=sum+Math.max(left[i], right[i]);
        }
        return (int)sum;
    }
}
