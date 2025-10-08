package mathsAndCombinatorics;

public class CountOfDivisors {
    
    // TC: O(max log(max)) overall
    // SC: O(N + max (max is auxilary)) overall
    public int[] solve(int[] A) {

        int N=A.length;
        int max=0;
        for(int i=0; i<N; i++){
            max=Math.max(A[i], max);
        }
        int[] arr=new int[max+1];

        for(int i=1; i<=max; i++){
            for(int j=i; j<=max; j=j+i){
                arr[j]++;
            }
        }

        int[] result=new int[N];

        for(int i=0; i<N; i++){
            result[i]=arr[A[i]];
        }
        return result;
    }
}
