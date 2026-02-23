package revision;

public class countOfPairs {
    
    public int countPairs(int[] A){

        int N=A.length;
        int count=0;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(A[i]>2*A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
