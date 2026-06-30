import java.util.ArrayList;

public class MinJumsReq {
    
    // Seats problem similar to placing people beside each other
    // In DSA 4: Greedy problem problem name: Seats

    // TC: O(N)
    // SC: O(N) // in worst case if all positions are x
    public int seats(String A) {

        int N=A.length();
        ArrayList<Integer> indexPositions=new ArrayList<>();
        for(int i=0; i<N; i++){
            if(A.charAt(i)=='x'){
                indexPositions.add(i); // adding the index where x is present
            }
        }

        int size=indexPositions.size();
        if(size==0){
            return 0;
        }
        int mid=size/2;
        int median=indexPositions.get(mid);
        int moves=0;
        int mod=10000003;
        for(int i=0; i<size; i++){

            int currentPosition=indexPositions.get(i);
            int target= median-(mid-i);
            int diff=Math.abs(target-currentPosition);
            moves=((moves%mod)+(diff%mod))%mod;
        }
        return moves;
    }
}
