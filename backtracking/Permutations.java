package backtracking;

import java.util.ArrayList;
// import java.util.HashSet;

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


    // below method using hashset
    // TC: O(N * N!)
    // SC: O(N)
    // public void backtrack(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> r, HashSet<Integer> set)
    // {
    //     if(r.size() == A.size())
    //     {
    //         result.add(new ArrayList<>(r));
    //         return ;
    //     }
        
    //     for(int j = 0; j< A.size();j++)
    //     {
    //         if(!set.contains(A.get(j)))
    //         {
    //             r.add(A.get(j));
    //             set.add(A.get(j));
    //             backtrack(A, result, r, set);  
    //             r.remove(r.size() - 1);
    //             set.remove(A.get(j));
    //         }
    //     }
    // }
    // public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
    //     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    //     ArrayList<Integer> r = new ArrayList<>();
    //     HashSet<Integer> set = new HashSet<>();
    //     backtrack(A, result, r, set);
        
    //     return result;
    // }
}
