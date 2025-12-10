package two_d_arrays.advance;

public class sumOfAllSubMatrices {
    
    // TC: O(N^3 * M^3)
    // SC: O(1)
    public int solve(int[][] A) {

        int N=A.length;
        int M=A[0].length;
        int sum=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                for(int k=i; k<N; k++){
                    for(int l=j; l<M; l++){
                        
                        for(int x=i; x<=k; x++){
                            for(int y=j; y<=l; y++){
                                sum+=A[x][y];
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }


    // TC: O(N*M)
    // SC: O(1)

// KEY IDEA

// A submatrix is fully determined by two points:

// ✔ Top-left corner → (i, j)
// ✔ Bottom-right corner → (k, l)

// Every submatrix in the matrix can be uniquely identified by choosing these 2 points.

//     INTUITION

// For any element A[i][j], imagine asking:

//  “In how many submatrices does this element appear?”

// To appear inside a submatrix:

// The submatrix must start somewhere above/left of the element.

// The submatrix must end somewhere below/right of the element.

// So we count:

// 1️⃣ Ways to choose a valid top-left corner of submatrix
// 2️⃣ Ways to choose a valid bottom-right corner

// Then multiply them.

// Top-left choices = (i + 1) × (j + 1)
// Bottom-right choices = (N - i) × (M - j)

// So we multiply:

// Total = (i+1) × (j+1) × (N-i) × (M-j)

    public int optimizedSolve(int[][] A) {

        int N=A.length;
        int M=A[0].length;
        long sum=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                long topLeft=(long)(i+1)*(j+1);
                long bottomRight=(long)(N-i)*(M-j);
                sum+=A[i][j]*topLeft*bottomRight;
            }
        }
        return (int)sum;
    }
}
