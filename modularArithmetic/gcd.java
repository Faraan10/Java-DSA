package modularArithmetic;

public class gcd {
    public int gcdSolve(int A, int B) {

        // using Euclidean Algorithm
        // TC: O(log B) for every iteration it is applying mod operation 
        // SC: O(1)
        while(B!=0){
            int temp=B;
            B=A%B;
            A=temp;
        }

        return A;
    }
}
