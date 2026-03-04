package revision;

public class ClosestMinMax {
    
    // TC: O(N^2)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            max=Math.max(max, A[i]);
            min=Math.min(min, A[i]);
        }
        // System.out.println(max+" "+ min);

        int length=Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            boolean isMax=false;
            boolean isMin=false;
            for(int j=i; j<N; j++){

                if(A[j]==max){
                    isMax=true;
                }
                if(A[j]==min){
                    isMin=true;
                }
                if(isMax==true && isMin==true){
                    length=Math.min(length, j-i+1);
                }
            }
        }
        return length;
    }
}
