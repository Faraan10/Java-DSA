package two_pointers;

import java.util.Arrays;

public class checkPairSum {
    

    public int solve(int A, int[] B) {

        int i=0;
        int j=B.length-1;

        Arrays.sort(B);

        while(i<j){
            if((long)B[i]+B[j]==A){
                return 1;
            }else if((long)B[i]+B[j]>A){
                j--;
            }else{
                i++;
            }
        }
        return 0;
    }
}
