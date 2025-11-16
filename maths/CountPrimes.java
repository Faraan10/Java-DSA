package maths;

import java.util.Arrays;

public class CountPrimes {
    
    // TC: O(N root N)
    // SC: O(1)
    public static boolean primeNumber(int N){

        if(N<=1){
            return false;
        }
        if(N==2){
            return true;
        }

        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                return false;
            }
        }
    return true;
    }
    public int solve(int A) {

        int count=0;
        for(int i=1; i<=A; i++){
            if(primeNumber(i)==true){
            count++;
            }
        }
        return count;
    }


    // most optimized approach
    // Sieve of Eratosthenes
    // TC: O(A log log A)
    // SC: O(A)
    public int optimizedSolve(int A) {

        if(A<=1){
            return 0;
        }

        boolean[] isPrime=new boolean[A+1];

        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2; i*i<=A; i++){
            for(int j=i*i; j<=A; j=j+i){
                isPrime[j]=false;
            }
        }

        int count=0;

        for(int i=2; i<=A; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}
