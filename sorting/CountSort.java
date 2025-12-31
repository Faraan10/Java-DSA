package sorting;

public class CountSort {
    
    public int[] solve(int[] A) {

        int N=A.length;
        int max=-1;

        for(int i=0; i<N; i++){
            max=Math.max(max, A[i]);
        }

        int[] freq=new int[max+1];

        for(int i=0; i<N; i++){
            freq[A[i]]++;
        }

        int index=0;
        for(int i=0; i<=max; i++){
            for(int j=0; j<freq[i]; j++){
                A[index]=i;
                index++;
            }
        }
        return A;
    }
}
