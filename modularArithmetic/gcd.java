package modularArithmetic;

public class gcd {
    public int gcdSolve(int A, int B) {

        // using Euclidean Algorithm
        // TC: O(log B) for every iteration it is applying mod operation 
        // SC: O(1) no extra spauce used
        while(B!=0){
            int temp=B;
            B=A%B;
            A=temp;
        }

        return A;
    }


    public int recursiveGcd(int A, int B){
        
        // TC: O(log B)
        // SC: O(log B) as recursive stack space used
        // computing the value by doing A%B 
        // Euclidean Algoithm recursive approach formula
        // gcd(A, B)=gcd(B, A%B);
        // and if B=0 return A;
        if(B==0){
            return A;
        }

        return recursiveGcd(B, A%B);
    }
}
