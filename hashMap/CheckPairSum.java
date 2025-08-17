package hashMap;

// import java.util.HashMap;
import java.util.HashSet;

public class CheckPairSum {
    
    // TC: O(B)
    // SC: O(B) worst case as we are using hashmap
    // public int solve(int A, int[] B) {

    //     HashMap<Integer, Integer> hm=new HashMap<>();
    //     int N=B.length;

    //     for(int i=0; i<N; i++){
    //         if(hm.containsKey(A-B[i])){
    //             return 1;
    //         }else{
    //             hm.put(B[i], 1);
    //         }
    //     }
    //     return 0;
    // }

    // best suited for this problem using HashSet

    public int solve(int A, int[] B) {
        // TC: O(B)
        // SC: O(B) worst case as we are using hashset
        HashSet<Integer> hs=new HashSet<>();
        int N=B.length;

        for(int i=0; i<N; i++){
            if(hs.contains(A-B[i])){
                return 1;
            }else{
                hs.add(B[i]);
            }
        }
        return 0;
    }
}
