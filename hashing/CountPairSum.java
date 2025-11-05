package hashing;

import java.util.HashMap;

public class CountPairSum {
    
    public int solve(int[] A, int B) {

        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<>();
        long count=0;

        for(int i=0; i<N; i++){
            if(hm.containsKey(B-A[i])){
                count+=hm.get(B-A[i]);
            }
            // below line we are updating value of A[i] in hashmap 
            // inside there is another function getOrDefault which takes two arguements
            // if A[i] is there in ahshmap gets its value and then we do +1 to update frequency
            // else the function gets default vlaue which is 0 (second argument) and then do +1 to update frequency
            hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
        }
        return (int)count%1000000007;
    }
}
