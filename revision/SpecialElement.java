package revision;

public class SpecialElement {
    
    // TC: O(N)
    // SC: O(1)
    public int specialEle(int[] A){

        int N=A.length;
        int total=0;
        for(int i=0; i<N; i++){
            total+=A[i];
        }

        int left=0;
        for(int i=0; i<N; i++){

            int right=total-left-A[i];
            if(right==left){
                return 1;
            }
            left+=A[i];
        }
        return 0;
    }
}
