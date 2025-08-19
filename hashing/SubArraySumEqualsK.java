package hashing;

import java.util.HashMap;

public class SubArraySumEqualsK {
    // Bruteforce
    // TC: O(N^3) as using 3 loops 3*N worst case
    // SC: O(1) no extra space used
    // public int solve(int[] A, int B) {

    //     int N=A.length;
    //     int count=0;
    //     for(int i=0; i<N; i++){
    //         for(int j=i; j<N; j++){
    //             int sum=0;
    //             for(int k=i; k<=j; k++){
    //                 sum+=A[k];
    //             }
    //             if(sum==B){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // little optimized using running sum 
    // TC: O(N^2)
    // SC: O(1)
    // public int solve(int[] A, int B) {

    //     int N=A.length;
    //     int count=0;
    //     for(int i=0; i<N; i++){
    //         int sum=0;
    //         for(int j=i; j<N; j++){
    //             sum+=A[j];
    //             if(sum==B){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }


    public int solve(int[] A, int B) {
        
        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0,1);

        int prefixSum=0;
        int count=0;

        for(int i=0; i<N; i++){

            prefixSum+=A[i];

            if(hm.containsKey(prefixSum-B)){
                count+=hm.get(prefixSum-B);
            }

            if(hm.containsKey(prefixSum)){
                int value=hm.get(prefixSum);
                int newValue=value+1;
                hm.put(prefixSum, newValue);
            }else{
                hm.put(prefixSum, 1);
            }
        }
        return count;
    }
    
}
