package two_d_arrays;

public class SpiralOrderMatrix2 {

    // TC: O(N^2)
    // SC:O(1)
    public int[][] generateMatrix(int A) {

        int[][] mat = new int[A][A];

        int top = 0, bottom = A - 1;
        int left = 0, right = A - 1;
        int count = 1;

        while (top <= bottom && left <= right) {
            // left to right loop
            for (int j = left; j <= right; j++) {
                mat[top][j] = count++;
            }
            top++;

            // top to bottom loop
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = count++;
            }
            right--;

            // right to left loop
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    mat[bottom][j] = count++;
                }
                bottom--;
            }

            // bottom to top loop
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = count++;
                }
                left++;
            }
        }

        return mat;
    }

    public int[][] generateMatrixSolve(int A) {

        int[][] mat=new int[A][A];

        int N=A;
        int count=1;
        int i=0;
        int j=0;

        while(N>1){

            for(int k=0; k<N-1; k++){
                mat[i][j]=count++;
                j++;
            }

            for(int k=0; k<N-1; k++){
                mat[i][j]=count++;
                i++;
            }

            for(int k=0; k<N-1; k++){
                mat[i][j]=count++;
                j--;
            }
            
            for(int k=0; k<N-1; k++){
                mat[i][j]=count++;
                i--;
            }

            i++;
            j++;
            N=N-2;
        }
        if(N==1){
            mat[i][j]=count++;
        }
        return mat;
    }
}
