package sliding_window;

public class subArrayWithLeastAverage {
    
    public int solve(int[] A, int B) {

        int N=A.length;
        int sum=0;
        int leastAvg=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0; i<B; i++){
            sum+=A[i];
        }
        if(sum<leastAvg){
            leastAvg=sum;
            idx=0;
        }
        

        int i=1;
        int j=B;
        while(j<N){
            sum=sum-A[i-1]+A[j];
            if(sum<leastAvg){
                leastAvg=sum;
                idx=i;
            }
            i++;
            j++;
        }
        return idx;
    }
}
