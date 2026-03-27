package revision;
import java.util.HashMap;

public class UniqueElement {
    
    // TC: O(N)
    // SC: O(1)
    // input: [2,3,4,5,3,5,2] this method only works when there is only 1
    // unique element in array and all other elements appear exactly 2 times
    // also first convert into binary then do dry run 
    public int unique(int[] A){

        int N=A.length;
        int ans=A[0];
        for(int i=1 ;i<N; i++){
            ans=ans^A[i];
        }
        return ans;
    }


    // same problem but in this the numbers can exist any no of times
    // only the number which occurs once will be returned as output
    // TC: O(N)
    // SC: O(N)
    public int uniqueEleMap(int[] A){

        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0; i<N; i++){
            hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
        }

        for(int i=0; i<N; i++){
            if(hm.get(A[i])==1){
                return A[i];
            }
        }
        return -1;
    }
}
