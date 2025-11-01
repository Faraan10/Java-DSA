package twoPointersApproach;
import java.util.*;

public class solution {
    
    public int solve(int[] A, int B){

        int count=0;

        Arrays.sort(A);

        int i=0;
        int j=A.length-1;

        while(i<=j){
            if(A[i]+A[j]<=B){
                i++;
                j--;
            }else{
                j--;
            }
            count++;
        }

        return count;
    }
}
