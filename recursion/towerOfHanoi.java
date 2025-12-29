package recursion;

import java.util.ArrayList;

public class towerOfHanoi {
    
    public void toh(int A, ArrayList<ArrayList<Integer>> ans, int src, int helper, int dest){

        if(A==0){
            return;
        }

        // step: 1 moving from sourse to helper with help of destination
        toh(A-1, ans, src, dest, helper);

        // Step 2: move disk A from src to dest
        ArrayList<Integer> list=new ArrayList<>();
        list.add(A);
        list.add(src);
        list.add(dest);
        ans.add(list);

        // Step 3: move A-1 from helper to dest
        toh(A-1, ans, helper, src, dest);
    }
    public ArrayList<ArrayList<Integer>> towerOfHanoiProblem(int A) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

        toh(A, ans, 1, 2, 3);

        return ans;

    }
}
