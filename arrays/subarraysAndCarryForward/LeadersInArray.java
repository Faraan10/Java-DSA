package arrays.subarraysAndCarryForward;

import java.util.ArrayList;

public class LeadersInArray {
    
    // TC: O(N)
    // SC: O(1)
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        ArrayList<Integer> list=new ArrayList<>();
        int N=A.size();
        list.add(A.get(N-1));
        int element=A.get(N-1);

        for(int i=N-2; i>=0; i--){
            if(A.get(i)>element){
                list.add(A.get(i));
                element=A.get(i);
            }
        }
        return list;
    }
}
