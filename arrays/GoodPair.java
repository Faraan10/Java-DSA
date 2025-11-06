package arrays;
import java.util.HashSet;

public class GoodPair {
    
    // TC: O(N^2)
    // SC: O(1)
    // bruteforce
    // will work for i!=j as j starting from i+1 so i will not be equal to j 
    // at any point
    // public int solve(int[] A, int B){

    //     int N=A.length;

    //     for(int i=0; i<N; i++){
    //         for(int j=i+1; j<N; j++){
    //             if(A[i]+A[j]==B){
    //                 return 1;
    //             }
    //         }
    //     }
    //     return 0;
    // }

    // TC: O(N)
    // SC: O(N)
    // optimized method using hashset so space O(N) and using compliment method
    public int solve(int[] A, int B){

        int N=A.length;

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0; i<N; i++){
            int compliment=B-A[i];
            if(hs.contains(compliment)){
                return 1;
            }else{
                hs.add(A[i]);
            }
        }
        return 0;
    }
}
