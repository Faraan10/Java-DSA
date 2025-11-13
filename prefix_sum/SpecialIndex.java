package prefix_sum;

public class SpecialIndex {
    
    // TC: O(N^2)
    // SC: O(1)
    // optimized brute force approach
    public int solve(int[] A) {

        int N=A.length;
        int count=0;

        for(int i=0; i<N; i++){
            int evenSum=0;
            int oddSum=0;
            int index=0;

            for(int j=0; j<N; j++){
                if(i==j){
                    continue;
                }

                if(index%2==0){
                    evenSum+=A[j];
                }else{
                    oddSum+=A[j];
                }
                index++;
            }
            if(evenSum==oddSum){
                count++;
            }
        }
        return count;
    }


    // optimized approach using prefix sum
    
    public int optimizedSolve(int[] A) {

        int N=A.length;

        int[] even=new int[N];
        int[] odd=new int[N];
        even[0]=A[0];
        odd[0]=0;

        for(int i=1; i<N; i++){
            if(i%2==0){
                even[i]=even[i-1]+A[i];
            }else{
                even[i]=even[i-1];
            }
            if(i%2==1){
                odd[i]=odd[i-1]+A[i];
            }else{
                odd[i]=odd[i-1];
            }
        }

        int count=0;
        int totalEven=even[N-1];
        int totalOdd=odd[N-1];
        for(int i=0; i<N; i++){
            int leftEven;
            int leftOdd;
            if(i==0){
                leftEven=0;
                leftOdd=0;
            }else{
                leftEven=even[i-1];
                leftOdd=odd[i-1];
            }

            int rightEven=totalOdd-odd[i];
            int rightOdd=totalEven-even[i];

            if(leftEven+rightEven == leftOdd+rightOdd){
                count++;
            }
        }
        return count;
    }
}
