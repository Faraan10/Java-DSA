package revision;

public class RecursivePrintNumbers {

    // TC: O(N)
    // SC: O(N)
    // input: 8
    // output: 1,2,3,4,5,6,7,8
    public void numbersPrinting(int N){

        if(N==0){
            return;
        }
        numbersPrinting(N-1);
        System.out.print(N+" ");

    }
    public void printNo(int N){

        numbersPrinting(N);

    }
}
