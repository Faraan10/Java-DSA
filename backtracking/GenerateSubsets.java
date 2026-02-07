package backtracking;

import java.util.ArrayList;

    // TC: O(2^N * N)
    // SC: O(N)
public class GenerateSubsets {
    
    // public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    //     // code here

    //     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    //     backtrack(A, 0, new ArrayList<>(), result);
    //     return result;
    // }

    // public static void backtrack(ArrayList<Integer> A, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
    //     // Add current subset to result
    //     result.add(new ArrayList<>(current));

    //     // Explore further elements
    //     for (int i = index; i < A.size(); i++) {
    //         current.add(A.get(i));              // Choose
    //         backtrack(A, i + 1, current, result); // Explore
    //         current.remove(current.size() - 1);   // Unchoose (backtrack)
    //     }
    // }


    public void backtrack(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list, ArrayList<Integer> A, int index){
        
        if(index==A.size()){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        // include
        list.add(A.get(index));
        backtrack(ans, list, A, index+1);
        list.remove(list.size()-1);

        // dont include
        backtrack(ans, list, A, index+1);
    }

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list=new ArrayList<>();
        backtrack(ans, list, A, 0);
        return ans;
    }

}
