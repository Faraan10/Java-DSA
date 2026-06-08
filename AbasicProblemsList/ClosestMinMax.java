package AbasicProblemsList;

public class ClosestMinMax {
    
    // TC: O(N^2)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(A[i]>max){
                max=A[i];
            }else if(A[i]<min){
                min=A[i];
            }
        }

        for(int i=0; i<N; i++){
            boolean maxFound=false;
            boolean minFound=false;
            for(int j=i; j<N; j++){
                if(A[j]==max){
                    maxFound=true;
                }
                if(A[j]==min){
                    minFound=true;
                }
                if(maxFound && minFound){
                    ans=Math.min(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}
