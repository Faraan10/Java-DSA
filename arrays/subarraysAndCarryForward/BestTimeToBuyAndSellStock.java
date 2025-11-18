package arrays.subarraysAndCarryForward;

public class BestTimeToBuyAndSellStock {
    
    // TC: O(N)
    // SC: O(1)
    public int maxProfit(final int[] A) {

        int N=A.length;
        int minVal=Integer.MAX_VALUE;
        int profit=0;
        int maxProfit=0;

        for(int i=0; i<N; i++){
            minVal=Math.min(minVal, A[i]);
            profit=A[i]-minVal;
            maxProfit=Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
