package sorting;

public class SmallestNumber {
    
    public int[] smallestNumber(int[] A) {

        int N=A.length;
        int[] arr=new int[10];
        for(int i=0; i<N; i++){
            arr[A[i]]++;
        }

        int idx=0;
        for(int i=0; i<10; i++){
            for(int j=0; j<arr[i]; j++){
                A[idx]=i;
                idx++;
            }
        }
        return A;
    }
}
