package recursion;

import java.util.ArrayList;

public class AllIndicesOfArray {
    
    public ArrayList<Integer> printIndices(ArrayList<Integer> A, ArrayList<Integer> ans, int start, int B){

        if(start==A.size()){
            return ans;
        }

        if(A.get(start)==B){
            ans.add(start);
        }

        return printIndices(A, ans, start+1, B);

    }
    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {

        ArrayList<Integer> ans=new ArrayList<>();
        return printIndices(A, ans, 0, B);
    }
}
