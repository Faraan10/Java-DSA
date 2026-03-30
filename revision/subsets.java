package revision;
import java.util.ArrayList;
import java.util.Arrays;

public class subsets {
    
    public ArrayList<ArrayList<Integer>> backtrackSubsets(int[] A){

        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> current=new ArrayList<>();

        solve(ans, current, 0, A);
        return ans;
    }

    public void solve(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int i, int[] A){

        if(i==A.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(A[i]);
        solve(ans, curr, i+1, A);

        
        curr.remove(curr.size()-1);
        while(i+1<A.length && A[i]==A[i+1]){
            i++;
        }
        solve(ans, curr, i+1, A);
    }
}
