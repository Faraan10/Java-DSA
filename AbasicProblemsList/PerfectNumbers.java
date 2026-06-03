package AbasicProblemsList;

public class PerfectNumbers {
    
    // TC: O(A)
    // SC: O(1)
    public int solve(int A) {

        int count=0;
        for(int i=1; i<A; i++){
            if(A%i==0){
                count+=i;
            }
        }
        if(count==A){
            return 1;
        }
        return 0;
    }


    // TC: O(root A)
    // SC: O(1)
    public int optSolve(int A) {

        if(A<=1){
            return 0;
        }
        int count=1;
        for(int i=2; i*i<=A; i++){
            if(A%i==0){
                if(i==A/i){
                    count=count+i;
                }else{
                    count=count+(i+A/i);
                }
            }
        }
        if(count==A){
            return 1;
        }
        return 0;
    }
}
