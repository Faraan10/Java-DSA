package revision;

import java.util.HashMap;

public class SubarrayWithSumEqualsK {
    
    // TC: O(N)
    // SC: O(N)
    public int solve(int[] A, int B) {

        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0, 1);
        int count=0;
        int sum=0;
        for(int i=0; i<N; i++){
            sum+=A[i];
            if(hm.containsKey(sum-B)){
                count=count+hm.get(sum-B);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
