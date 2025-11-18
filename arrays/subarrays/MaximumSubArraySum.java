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


    // most optimized approach
    // using sliding window
    // TC: O(N)
    // SC: O(1)

    // Note: when using sliding window inside subarray problems 
    // you can use sliding window only when the constraints state that there  
    // are non negative numbers such then it means that the array is monotonic

    // such as this this is monotonic array sum always increases when 
    // calculating it should either keep on increasing or keep on decreasing
    // Problem Constraints:
    // 1 <= A <= 10^3
    // 1 <= B <= 10^9
    // 1 <= C[i] <= 10^6
    
    // which means that when moving forward in sliding window the sum will
    // always increase and when it is greater than B then we shrink the window
    // with sum=sum-A[left]; and then do left++; 
    // until we get sum<=B then we get another element which has subarray <=B
    // then we can increase count 

    public int optimizedMaxSubarray(int A, int B, int[] C) {

        int ans=0;
        int left=0;
        int sum=0;

        for(int right=0; right<A; right++){

            sum+=C[right]; // adding elements to the sum

            while(sum>B && left<=right){// when sum>B && left index<=right index
                sum=sum-C[left]; // removing the leftmost element 
                left++; // increasing left that element is removed
            }

            ans=Math.max(ans, sum);
        }

        return ans;
    }
}
