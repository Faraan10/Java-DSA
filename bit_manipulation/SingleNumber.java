package bit_manipulation;

public class SingleNumber {
    
    // TC: O(N)  only 1 loop till N
    // SC: O(1) No additional space used
    public int getNumber(int[] arr){

        int N=arr.length;
        int no=0;
        for(int i=0; i<N; i++){
            no^=arr[i];
        }
        return no;
    }
}
