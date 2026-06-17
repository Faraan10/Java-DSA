package AllBasicProblemsList;

public class BuysAndSellStock {
    
    // TC: O(N)
    // SC: O(1)
    public int maxProfit(final int[] A) {

        if(A.length==0){
            return 0;
        }
        int N=A.length;
        int min=A[0];
        int profit=0;
        int maxProfit=0;
        for(int i=1; i<N; i++){
            profit=A[i]-min;
            maxProfit=Math.max(profit, maxProfit);
            min=Math.min(min, A[i]);
        }
        return maxProfit;
    }
}
