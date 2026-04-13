package revision;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    
    // TC: O(N)
    // SC: O(N)
    public int solve(int[] A) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.
  
    int N=A.length;
    HashSet<Long> hs=new HashSet<>();
    long sum=0;
    for(int i=0; i<N; i++){
        sum+=A[i];
        if(sum==0 || hs.contains(sum)){
            return 1;
        }
        hs.add(sum);
    }
    return 0;
  }
}
