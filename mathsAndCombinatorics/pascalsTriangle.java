package mathsAndCombinatorics;

public class pascalsTriangle {
    
    // TC: O(N^2)
    // SC: O(1) no additional auxilary space used only the output 2d array
    public int[][] solve(int A) {

        int[][] matrix=new int[A][A];

        for(int i=0; i<A; i++){
            matrix[i][0]=1;
            matrix[i][i]=1;
            for(int j=1; j<i; j++){
                matrix[i][j]=matrix[i-1][j]+matrix[i-1][j-1];
            }
        }

        return matrix;
    }
}
