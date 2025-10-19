package mathAndtwoPointers;

import java.util.Arrays;

public class PairsWithGivenDifference {
    
    // TC: O(N)
    // S: O(1)
    public int solve(int[] A, int B) {

        int N=A.length;
        int l=0;
        int r=1;
        int count=0;
        Arrays.sort(A);
        while(r<N){
            if(A[r]-A[l]==B){
                count++;
                int l1=l;
                int r1=r;
                while(l1<N && A[l1]==A[l]){
                    l1++;
                }
                while(r1<N && A[r1]==A[r]){
                    r1++;
                }
                l=l1;
                r=r1;
                if(l==r){
                    r++;
                }
            }else if(A[r]-A[l]>B){
                l++;
                if(l==r){
                    r++;
                }
            }else{
                r++;
            }
        }
        return count;
    }
    
}
