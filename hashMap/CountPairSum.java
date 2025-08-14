package hashMap;

public class CountPairSum {
    // Brute force
    // TC: O(N^2) 
    // SC: O(1)

    public int solve(int[] A, int B) {

        int N=A.length;
        int count=0;
        
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(A[i]+A[j]==B){
                    count++;
                }
            }
        }
        return count%1000000007;
    }
}
