package sliding_window;

public class MinimumSwaps {
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A, int B) {

        int N=A.length;
        int count=0;

        for(int i=0; i<N; i++){
            if(A[i]<=B){
                count++;
            }
        }

        if(count<=1){
            return 0;
        }

        int range=0;
        for(int i=0; i<count; i++){
            if(A[i]<=B){
                range++;
            }
        }

        int i=1; 
        int j=count;
        int ans=range;
        while(j<N){
            if(A[i-1]<=B){ // if good number is removed -1 
                range=range-1;
            }
            if(A[j]<=B){ // if good number is being added doing +1
                range=range+1;
            }
            ans=Math.max(ans, range);
            i++;
            j++;
        }

        return count-ans;
    }
}
