package arrays;


public class CountOfPrimes {
    
    // TC: O(A root A) iterating till A times for the number and for each number
    // doing root A operations to find it is prime or not
    // SC: O(1
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


    // Sieve of Eratosthenes 
    // TC: O(A log log A)
    // SC: O(A)
    // public int solve(int A) {

    //     if(A<=1){
    //         return 0;
    //     }
    //    boolean[] isPrime=new boolean[A+1]; // size of boolean array
    //    Arrays.fill(isPrime, true);
    //    isPrime[0]=false;
    //    isPrime[1]=false;

    //    for(int i=2; i*i<=A; i++){
    //        for(int j=i*i; j<=A; j=j+i){
    //             isPrime[j]=false;
    //        }
    //    }
       
    //    int count=0;
    //    if(A>=2){
    //        count=1;
    //    }
    //    for(int i=3; i<=A; i=i+2){
    //        if(isPrime[i]){
    //            count++;
    //        }
    //    }
    //    return count;
    // }
}
