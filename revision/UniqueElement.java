package revision;

public class UniqueElement {
    
    // TC: O(N)
    // SC: O(1)
    // input: [2,3,4,5,3,5,2] this method only works when there is only 1
    // unique element in array and all other elements appear exactly 2 times
    // also first convert into binary then do dry run 
    public int unique(int[] A){

        int N=A.length;
        int ans=A[0];
        for(int i=1 ;i<N; i++){
            ans=ans^A[i];
        }
        return ans;
    }
}
