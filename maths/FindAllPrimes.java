package maths;

import java.util.ArrayList;

public class FindAllPrimes {
    
    // TC: O(N root N) 
    // SC: O(N) for taking array 
    public int[] solve(int A) {
        
        if(A<2){
            int[] arr=new int[0];
            return arr;
        }
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=2; i<=A; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

        int[] arr=new int[list.size()];

        for(int i=0; i<arr.length; i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

    public static boolean isPrime(int N){

        int count=0;

        for(int i=1; i*i<=N; i++){
            if(N%i==0){
                if(i==N/i){
                    count=count+1;
                }else{
                    count=count+2;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
