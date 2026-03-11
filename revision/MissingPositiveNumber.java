package revision;

public class MissingPositiveNumber {
    
    // TC: O(N)
    // SC: O(N)
    public int firstMissingPositive(int[] A) {

        int N=A.length;
        int[] arr=new int[N];
        for(int i=0; i<N; i++){
            if(A[i]>0 && A[i]<=N){
                arr[A[i]-1]++;
            }
        }

        // for(int i=0; i<N; i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i=0; i<N; i++){
            if(arr[i]==0){
                return i+1;
            }
        }
        return N+1;
    }
}
