package mathsAndCombinatorics;
import java.util.*;


public class SieveOfEratosthenes{

    public ArrayList<Integer> primes(int A){

        ArrayList<Integer> list=new ArrayList<>();

        boolean[] isPrime=new boolean[A+1];
        Arrays.fill(isPrime, true); // initially keeping all true
        isPrime[0]=false; // setting false as 0 is not prime
        isPrime[1]=false; // setting false as 1 is not prime

        for(int i=2; i*i<=A; i++){
            if(isPrime[i]){
                for(long j=(long)i*i; j<=A; j=j+i){
                    isPrime[(int)j]=false;
                }
                list.add(i);
            }
        }

        return list;
    }
}