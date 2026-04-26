import java.util.ArrayList;

public class Seats {
    
    // Also know as minimum moves req to seat people together
    // and in this problem we use the help of MEDIAN as it helps 
    // reduces the total movement (distance) 
    // and here even if array is even or odd mid is taked as size/2

    // TC: O(N)
    // SC: O(N)
    public int seats(String A) {

        int N=A.length();
        int mod=10000003;
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0; i<N; i++){
            if(A.charAt(i)=='x'){
                pos.add(i);
            }
        }

        int size=pos.size();
        if(size==0) return 0;

        int mid=size/2; // calculating size
        int median=pos.get(mid); // getting median value
        long moves=0;

        for(int i=0; i<size; i++){

            int target=median-(mid-i);
            int diff=Math.abs(target-pos.get(i));
            moves=((moves%mod)+(diff%mod))%mod;
        }
        return (int)moves;
    }
}
