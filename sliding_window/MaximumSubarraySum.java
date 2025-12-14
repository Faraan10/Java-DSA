package sliding_window;

public class MaximumSubarraySum {
    
    public int maxSubarray(int A, int B, int[] C) {

        int ans=0;
        int left=0;
        int sum=0;

        for(int right=0; right<A; right++){

            sum+=C[right];

            while(sum>B && left<=right){
                sum=sum-C[left];
                left++;
            }

            ans=Math.max(ans, sum);
        }

        return ans;
    }
}
