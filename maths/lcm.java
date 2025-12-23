package maths;

import java.util.Scanner;

public class lcm {
    
    // TC: O(N)
    // SC: O(1)
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();

        int val=Math.max(A,B);

        for(int i=val; i<=A*B; i++){
            if(i%A==0 && i%B==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
