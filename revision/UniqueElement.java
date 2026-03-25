package revision;

public class UniqueElement {
    
    // TC: O(N)
    // SC: O(1)
    // inout: [2,3,4,5,3,2]
    public int unique(int[] A){

        int N=A.length;
        int ans=A[0];
        for(int i=1 ;i<N; i++){
            ans=ans^A[i];
        }
        return ans;
    }
}
