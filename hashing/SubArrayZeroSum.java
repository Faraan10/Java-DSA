package hashing;

import java.util.HashSet;

public class SubArrayZeroSum {
    public int solve(int[] A) {

        int N=A.length;
        HashSet<Long> hs=new HashSet<>();
        long sum=0;

        for(int i=0; i<N; i++){
            sum+=A[i]; // prefix at current index 
            if(sum==0 || hs.contains(sum)){
                return 1;
            }
            hs.add(sum);
        }
        return 0;
  }
}
