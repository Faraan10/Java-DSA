package arrays;
import java.util.*;

public class InsertIntervals {
    
    public ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> interval ){

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        arr.add(interval);

        Collections.sort(arr, (a, b)-> a.get(0) - b.get(0));


        int s1=arr.get(0).get(0);
        int e1=arr.get(0).get(1);

        for(int i=1; i<arr.size(); i++){

            int s2=arr.get(i).get(0);
            int e2=arr.get(i).get(1);

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
