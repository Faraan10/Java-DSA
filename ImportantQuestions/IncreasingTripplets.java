package ImportantQuestions;

public class IncreasingTripplets {
    
    // TC: O(N^2)
    
    public int solve(int[] A) {
        int n = A.length , ans = 0;
        for(int i = 0 ; i < n ; i++){
            int l = 0 , r = 0;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    l += 1;
                }
            }
            for(int j = i + 1 ; j < n ; j++){
                if(A[i] < A[j]){
                    r += 1;
                }
            }
            ans += (l * r);
        }
        return ans;
    }
}
