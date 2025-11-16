package maths;

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
}
