package bit_manipulation;

public class SingleNumber {
    
    public int getNumber(int[] arr){

        int N=arr.length;
        int no=0;
        for(int i=0; i<N; i++){
            no^=arr[i];
        }
        return no;
    }
}
