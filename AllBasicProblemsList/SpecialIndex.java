package AllBasicProblemsList;

public class SpecialIndex {
    
    // TC: O(N) 3N but we ignore constant values
    // SC: O(N) 2N but we ignore constants as we created 
    // 2 prefix arrays even and odd
    // Note: for this problem sum of all numbers will not be
    // >10^9 was in the constraint so I used int else we
    // should be using long for prefix arrays 
    public int solve(int[] A) {

        int N=A.length;

        int[] even=new int[N];
        even[0]=A[0];
        for(int i=1; i<N; i++){
            if(i%2==0){
                even[i]=even[i-1]+A[i];
            }else{
                even[i]=even[i-1];
            }
        }

        int[] odd=new int[N];
        odd[0]=0;
        for(int i=1; i<N; i++){
            if(i%2!=0){
                odd[i]=odd[i-1]+A[i];
            }else{
                odd[i]=odd[i-1];
            }
        }

        int count=0;
        for(int i=0; i<N; i++){

            int leftEven;
            int leftOdd;

            if(i==0){
                leftEven=even[0];
                leftOdd=odd[0];
            }else{
                leftEven=even[i-1];
                leftOdd=odd[i-1];
            }

            int rightEven=odd[N-1]-odd[i];
            int rightOdd=even[N-1]-even[i];

            if(leftEven+rightEven==leftOdd+rightOdd){
                count++;
            }
        }
        return count;
    }
}
