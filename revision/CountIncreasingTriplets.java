package revision;

public class CountIncreasingTriplets {
    
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
}
