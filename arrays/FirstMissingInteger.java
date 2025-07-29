package arrays;

public class FirstMissingInteger {
    public int firstMissingPositive(int[] A) {

        int N=A.length;
        boolean[] arr=new boolean[N];
        for(int i=0; i<N; i++){
            if(A[i]<=0 || A[i]>N){
                continue;
            }
            if(A[i]<=N){
                arr[A[i]-1]=true;
            }
        }

        for(int i=0; i<N; i++){
            if(arr[i]==false){
                return i+1;
            }
        }
        return N+1;
    }
}
