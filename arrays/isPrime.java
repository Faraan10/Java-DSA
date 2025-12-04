package arrays;

public class isPrime {
    
    // TC: O(root A) 
    // suppose N=100 i will only go till 10
    // 10*10 =100
    // 1 and 100 are factors - so here 2 factors
    // 2 and 50 are factors - so here 2 factors
    // 4 and 25 are factors - so here 2 factors
    // 5 and 20 are factors - so here 2 factors
    // 10 and 10 are factors - so here 1 factor as 10 is repeating on both sides
    // SC: O(1)
    public int solve(int A) {

        if(A==1){
            return 0;
        }
        
        for(int i=2; i*i<=A; i++){
            if(A%i==0){
                return 0;
            }
        }
        return 1;
    }
}
