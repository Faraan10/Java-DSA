package maths;

import java.util.Scanner;

public class armstrongNumber {
    
    // printing all armstrong numbers from 1 to N inclusive
    // TC: O(N log N)
    // SC: O(1)

    public static int calculate(int base, int exp){

        int sum=1;
        for(int i=1; i<=exp; i++){
            sum*=base;
        }
        return sum;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();    
        
        if(N==0){
            System.out.println(0);
            sc.close();
            return;
        }

        for(int i=1; i<=N; i++){
            int A=i;
            int count=0;
            while(A!=0){
                A=A/10;
                count++;
            }

            A=i;
            int sum=0;
            while(A!=0){
                int digit=A%10;
                sum=sum+calculate(digit, count);
                A=A/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
