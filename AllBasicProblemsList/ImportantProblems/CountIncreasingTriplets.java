package AllBasicProblemsList.ImportantProblems;

public class CountIncreasingTriplets {
    
    
    public int solve(int[] A) {

        // TC: O(N^3)
        // SC: O(1)
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


    public int optmizedSolve(int[] A) {

        // TC: O(N^2)
        // SC: O(1)
        int N=A.length;
        long count=0;

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
            count=count+((long)left*right);
        }
        return (int)count;
    }
}
