package arrays.subarrays;

public class MaximumSubArraySum {
    
    // bruteforce 
    // TC: O(C^3)
    // SC: O(1) 
    public int maxSubarray(int A, int B, int[] C) {

        int ans=0;
        for(int i=0; i<A; i++){
            for(int j=i; j<A; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=C[k];
                    if(sum<=B){
                        ans=Math.max(ans, sum);
                    }
                }
            }
        }
        return ans;
    }

    // optimized approach
    // TC: O(C^2)
    // SC: O(1)
    public int maxSubarrayRunningSum(int A, int B, int[] C) {

        int ans=0;
        for(int i=0; i<A; i++){
            int sum=0;
            for(int j=i; j<A; j++){
                sum+=C[j];
                if(sum<=B){
                    ans=Math.max(ans, sum);
                }
            }
        }
        return ans;
    }
}
