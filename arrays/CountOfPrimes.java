package arrays;

public class CountOfPrimes {
    
    public int solve(int A) {

        if(A<=1){
            return 0;
        }

        int count=0;

        for(int i=2; i<=A; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int N){

        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}
