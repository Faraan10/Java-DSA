package revision;
import java.util.HashSet;

// Given a sorted array, determine if there exists a pair whose 
// sum equals K.

// Return 1 if exists, otherwise 0.

// Example:
// A = [1,2,3,4,6]
// K = 6

// Output:
// 1

// Because:
// 2 + 4 = 6

public class PairExists {
    
    // TC: O(N^2)
    // SC: O(1)
    public int solve(int[] A, int K){

        int N=A.length;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(A[i]+A[j]==K){
                    return 1;
                }
            }
        }
        return 0;
    }

    // TC: O(N)
    // SC: O(N)
    public int optSolve(int[] A, int K){

        int N=A.length;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0; i<N; i++){
            if(hs.contains(K-A[i])){
                return 1;
            }
            hs.add(A[i]);
        }
        return 0;
    }


    // Most optimized 
    // here we observe that the array is already sorted so we can use
    // two pointers approach and find the pair exists or not by taking
    // smallest and largest element and sum them 

    public int mostOptSolve(int[] A, int K){
        
        int i=0;
        int j=A.length-1;
        while(i<j){

            int sum=A[i]+A[j];
            if(sum==K){
                return 1;
            }else if(sum<K){
                i++;
            }else{
                j++;
            }
        }
        return 0;
    }
}
