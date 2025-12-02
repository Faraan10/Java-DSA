package arrays;

public class CountFactors {
    
    // TC: O(root A) factors for 100 till 10 
    // 10*10 =100
    // 1 and 100 are factors - so here 2 factors
    // 2 and 50 are factors - so here 2 factors
    // 4 and 25 are factors - so here 2 factors
    // 5 and 20 are factors - so here 2 factors
    // 10 and 10 are factors - so here 1 factor as 10 is repeating on both sides
    // SC: O(1)
    public int solve(int A) {

       int count=0;

       for(int i=1; i*i<=A; i++){
           if(A%i==0){
               if(i==A/i){
                   count++;
               }else{
                   count=count+2;
               }
           }
       }
       return count;
    }
}
