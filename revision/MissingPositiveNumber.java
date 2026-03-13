package revision;

public class MissingPositiveNumber {
    
    // TC: O(N)
    // SC: O(N)
    // Dry run this method
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


    // TC: O(N)
    // SC: O(1) This is a cyclic sort approach pattern
    // Dry run this method
    public int optimizedFirstMissingPositive(int[] A){
        int N=A.length;

        for(int i=0; i<N; i++){

            while(A[i]>0 && A[i]<=N && A[i] != A[A[i]-1]){

                int temp=A[i];
                A[i]=A[temp-1];
                A[temp-1]=temp;
            }
        }

        for(int i=0; i<N; i++){
            if(A[i] != i+1){
                return i+1;
            }
        }
        return N+1;
    }
}
