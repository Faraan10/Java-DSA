package AbasicProblemsList;

public class SubArrayGivenRange{

    // TC: O(N) as in worst case B can be 0 and C can be N-1
    // SC: O(1)
    public int[] solve(int[] A, int B, int C) {

        int[] arr=new int[C-B+1];
        
        for(int i=B; i<=C; i++){
            arr[i-B]=A[i];
        }
        return arr;
    }
}