package AbasicProblemsList;

import java.util.ArrayList;

public class LeadersInArray {
    
    // TC: O(N) 
    // SC: O(N) using arraylist 
    // in this problem I am mainting the order of the 
    // elements in the given A array 
    public int[] solve(int[] A) {

        int N=A.length;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(A[N-1]);
        int max=A[N-1];
        for(int i=N-2; i>=0; i--){
            if(A[i]>max){
                list.add(A[i]);
                max=A[i];
            }
        }

        int[] arr=new int[list.size()];

        int j=list.size()-1;
        for(int i=0; i<arr.length; i++){
            arr[i]=list.get(j);
            j--;
        }
        return arr;
    }
}
