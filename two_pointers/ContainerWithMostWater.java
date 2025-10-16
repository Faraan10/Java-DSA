package two_pointers;

public class ContainerWithMostWater {
    
    // TC: O(N)
    // SC: O(1)
    // formula for this problem: to get the area with most container
    // Math.min(A[l], A[r])*(r-l)
    public int maxArea(int[] A){

        int N=A.length;
        int l=0;
        int r=N-1;

        int ans=0;
        while(l<r){

            int area=(Math.min(A[l], A[r])*(r-l));
            ans=Math.max(ans, area);

            if(A[l]<=A[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
