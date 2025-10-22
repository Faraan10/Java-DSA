package backtracking;

import java.util.ArrayList;

public class Permutations {
    
    // TC: O(N* N!)
    // SC: O(N)
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

        backtrack(ans, A, 0, A.size());

        return ans;
    }

    public static void backtrack(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> A, int idx, int N){

        if(idx==N){
            ans.add(new ArrayList<>(A));
            return;
        }

        for(int i=idx; i<A.size(); i++){

            int temp=A.get(idx);
            A.set(idx, A.get(i));
            A.set(i, temp);

            backtrack(ans, A, idx+1, N);

            temp=A.get(idx);
            A.set(idx, A.get(i));
            A.set(i, temp);

        }
    }
}
