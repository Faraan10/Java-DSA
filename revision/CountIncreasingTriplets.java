package revision;

public class CountIncreasingTriplets {
    
    // TC: O(N^3)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int count=0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    if(A[i]<A[j] && A[j]<A[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }


    // TC: O(N^2)
    // SC: O(1)
    public int optimizedSolve(int[] A) {

        int N=A.length;
        int count=0;
        
        for(int i=0; i<N; i++){

            int left=0;
            int right=0;
            for(int j=0; j<i; j++){
                if(A[j]<A[i]){
                    left=left+1;
                }
            }

            for(int j=i+1; j<N; j++){
                if(A[i]<A[j]){
                    right=right+1;
                }
            }
            count=count+(left*right); // we are multiplying here so if left
            // is 0 or right is 0 then left+right sum will be 0 
            // basic combinatorics problem
        }

        return count;
    }

}
