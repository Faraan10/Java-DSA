package prefix_sum;

public class RainWaterTrap {
    public int trap(final int[] A) {

        int N=A.length;
        int[] left=new int[N];

        left[0]=A[0];
        for(int i=1; i<N; i++){
            left[i]=Math.max(left[i-1],A[i]);
        }

        int[] right=new int[N];
        right[N-1]=A[N-1];
        for(int i=N-2; i>=0; i--){
            right[i]=Math.max(right[i+1], A[i]);
        }

        int[] arr=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=Math.min(right[i], left[i]);
        }

        int ans=0;
        for(int i=0; i<N; i++){
            ans+=arr[i]-A[i];
        }
        return ans;
    }
}
