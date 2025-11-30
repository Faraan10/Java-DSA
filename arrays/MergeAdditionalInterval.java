package arrays;

import java.util.Collections;

public class MergeAdditionalInterval {

    // TC: O(A log A)
    // SC: O(1) 
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        A.add(B); // adding the new list to the existing 2d arraylist
        Collections.sort(A, (a,b)-> a.get(0)-b.get(0)); // sorting 2d arraylist based on start times

        int s1=A.get(0).get(0);
        int e1=A.get(0).get(1);

        for(int i=1; i<A.size(); i++){

            int s2=A.get(i).get(0);
            int e2=A.get(i).get(1);

            if(e1>=s2){
                e1=Math.max(e1, e2);
            }else{

                // they dont overlap
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
