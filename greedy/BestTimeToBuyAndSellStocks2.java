public class BestTimeToBuyAndSellStocks2 {
    
    // TC: O(N)
    // SC: O(1)
    public int maxProfit(final int[] A) {

        int profit = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                profit += A[i] - A[i - 1];
            }
        }

        return profit;
    }
}
