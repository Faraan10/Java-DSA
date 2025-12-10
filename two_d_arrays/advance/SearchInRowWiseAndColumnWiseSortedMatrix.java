package two_d_arrays.advance;

public class SearchInRowWiseAndColumnWiseSortedMatrix {
    
    // TC: O(N+M)
    // because we are moving atmost N steps downwards and atmost M steps 
    // sideways in this case to left as we are starting from top right position
    // SC: O(1)
    public int solve(int[][] A, int B) {

        int N=A.length;
        int M=A[0].length;
        int sum=0;
        int ans=Integer.MAX_VALUE;

        int i=0;
        int j=M-1;

        while(i<N && j>=0){
            if(A[i][j]==B){
                sum=((i+1)*1009+(j+1));
                ans=Math.min(ans, sum);
                j--;
            }else if(A[i][j]>B){
                j--;
            }else{
                i++;
            }
        }
        if(ans != Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
}
