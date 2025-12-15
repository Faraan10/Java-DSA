package arrays;

public class SecondLargest {

    // TC: O(N)
    // SC: O(1)
    public int twoLoopsSolve(int[] A) {

        int N=A.length;
        int largest=A[0];
        int secondLargest=-1;

        for(int i=1; i<N; i++){
            largest=Math.max(A[i], largest);
        }

        for(int i=0; i<N; i++){
            if(A[i] != largest){
                secondLargest=Math.max(secondLargest, A[i]);
            }
        }
        return secondLargest;
    }
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int largest=A[0];
        int secondLargest=-1;

        for(int i=1; i<N; i++){
            if(A[i]>largest){
                secondLargest=largest;
                largest=A[i];
            }else if(A[i]<largest && A[i]>secondLargest){
                secondLargest=A[i];
            }
        }
        return secondLargest;
    }
}
