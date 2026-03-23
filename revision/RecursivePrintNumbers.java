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

    // TC: O(N)
    // SC: O(N)
    // input: 8
    // output: 8,7,6,5,4,3,2,1
    public void numbersPrintingReverse(int N){

        if(N==0){
            return;
        }
        System.out.print(N+" ");
        numbersPrinting(N-1);
    }

    public void printNo(int N){

        numbersPrinting(N);

    }
}
