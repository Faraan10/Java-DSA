package AbasicProblemsList;

public class ClosestMinMax {
    
    // TC: O(N^2)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }

        for(int i=0; i<N; i++){
            boolean maxFound=false;
            boolean minFound=false;
            for(int j=i; j<N; j++){
                if(A[j]==max){
                    maxFound=true;
                }
                if(A[j]==min){
                    minFound=true;
                }
                if(maxFound && minFound){
                    ans=Math.min(ans, j-i+1);
                }
            }
        }
        return ans;
    }


    // optimized problem solution with calculating
    // max and min first and then using index manipulation
    // and storing latest min and max index solved it
    // TC: O(N)
    // SC: O(1)
    public int optimizedSolve(int[] A) {

        int N=A.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }

        // edge case as if all elements are same 
        // or if it is only 1 number in array
        if(max==min){
            return 1;
        }

        int minIdx=-1;
        int maxIdx=-1;
        for(int i=0; i<N; i++){
            
            if(A[i]==max){
                maxIdx=i;
                if(minIdx != -1){
                    ans=Math.min(ans, (Math.abs(minIdx-maxIdx)+1));
                }
            }

            if(A[i]==min){
                minIdx=i;
                if(maxIdx != -1){
                    ans=Math.min(ans, (Math.abs(minIdx-maxIdx)+1));
                }
            }

        }
        return ans;
    }
}
