package AbasicProblemsList;

import java.util.Scanner;

public class CountDigits {
    
    // TC: O(log T)
    // SC: O(1)

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T!=0){
            int N=sc.nextInt();
            int count=0;
            if(N==0){
                System.out.println(1);
            }else{
                while(N!=0){
                N=N/10;
                count++;
            }
            System.out.println(count);
            }
            T--;
        }
        sc.close();
    }
}
