package AbasicProblemsList;

public class SubarrayWithLeastAvg {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A, int B) {

        int N=A.length;
        int i=0;
        int j=B;
        int sum=0;
        int startIdx=0;
        int minSum=Integer.MAX_VALUE;
        while(i<j){
            sum+=A[i];
            i++;
        }
        minSum=sum;

        i=1;
        while(j<N){
            sum=sum-A[i-1]+A[j];
            if(sum<minSum){
                minSum=sum;
                startIdx=i;
            }
            i++;
            j++;
        }
        return startIdx;
    }
}
