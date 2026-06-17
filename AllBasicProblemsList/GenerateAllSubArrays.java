package AllBasicProblemsList;

import java.util.ArrayList;

public class GenerateAllSubArrays {
    
    // TC: O(N^3) as we have to generate it is O(N^3)
    // SC: O(N) using 1 arraylist inside j loop 
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int N=A.size();

        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                ArrayList<Integer> list=new ArrayList<>();
                for(int k=i; k<=j; k++){
                    list.add(A.get(k));
                }
                ans.add(list);
            }
        }
        return ans;
    }
}
