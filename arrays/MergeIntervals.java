package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MergeIntervals {
    
    // TC: O(N log N)
    // SC: O(1)
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int N=A.size();
        Collections.sort(A, (a,b)-> a.get(0)-b.get(0));

        int s1=A.get(0).get(0);
        int e1=A.get(0).get(1);

        for(int i=1; i<N; i++){

            int s2=A.get(i).get(0);
            int e2=A.get(i).get(1);

            if(e1>=s2){
                e1=Math.max(e1, e2);
            }else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(s1);
                list.add(e1);
                ans.add(list);

                s1=s2;
                e1=e2;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(s1);
        list.add(e1);
        ans.add(list);

        return ans;
    }
}
