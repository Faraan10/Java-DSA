package AbasicProblemsList;

public class MaximumSubarray {
    
    public int maxSubarray(int A, int B, int[] C) {

        int left=0;
        int sum=0;
        int maxSum=0;

        for(int right=0; right<A; right++){
            sum+=C[right];
            while(sum>B && left<=right){
                sum-=C[left];
                left++;
            }
            maxSum=Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
