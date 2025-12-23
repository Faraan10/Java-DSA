package maths;

import java.util.Scanner;

public class hcf {
    
    // TC: O(N)
    // SC: 0(1)
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();

        int val;
        if(A<=B){
            val=A;
        }else{
            val=B;
        }

        int hcf=1;
        for(int i=val; i>=1; i--){
            if(A%i==0 && B%i==0){
                hcf=i;
                break;
          }
        }
        System.out.println(hcf);
        sc.close();
    }
}
