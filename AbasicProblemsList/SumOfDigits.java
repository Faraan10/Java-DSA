package AbasicProblemsList;

import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
       Scanner sc=new Scanner(System.in);

       int T=sc.nextInt();

       while(T!=0){
            int N=sc.nextInt();
            int sum=0;
            while(N!=0){
                int digit=N%10;
                sum=sum+digit;
                N=N/10;
            }
            System.out.println(sum);
            T--;
       }
    }
}
