package arrays;

public class FirstMissingInteger {

    // TC: O(N) // 2 loops N + N = 2N,  constants are ignored so O(N)
    // SC: O(N) // as I am using boolean array additional space
    // public int firstMissingPositive(int[] A) {

    //     int N=A.length;
    //     boolean[] arr=new boolean[N];
    //     for(int i=0; i<N; i++){
    //         if(A[i]<=0 || A[i]>N){
    //             continue;
    //         }
    //         if(A[i]<=N){
    //             arr[A[i]-1]=true;
    //         }
    //     }

    //     for(int i=0; i<N; i++){
    //         if(arr[i]==false){
    //             return i+1;
    //         }
    //     }
    //     return N+1;
    // }


    // TC: O(N) using only 1 while loop 
    // SC: O(1) no additional space used
    public int firstMissingPositive(int[] A) {

        int N=A.length;
        int i=0;

        while(i<N){
            int correctIndex=A[i]-1;

            if(A[i]>0 && A[i]<=N && A[correctIndex] != A[i]){
                int temp=A[i];
                A[i]=A[correctIndex];
                A[correctIndex]=temp;
            }else{
                i++;
            }
        }

        for(int j=0; j<N; j++){
            if(A[j] != j+1){
                return j+1;
            }
        }
        return N+1;
    }
}
