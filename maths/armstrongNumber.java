package maths;

import java.util.Scanner;

public class armstrongNumber {
    
    // printing all armstrong numbers from 1 to N inclusive
    // TC: O(N log N)
    // SC: O(1)

    public static int armstrong(int val, int count){

        int ans=1;
        for(int i=1; i<=count; i++){
            ans=ans*val;
        }
        return ans;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        for(int i=1; i<=N; i++){ // starting here as after 1 directly next armstrong number is 153

            int count=0;
            int number=i;
            while(number!=0){
                number=number/10;
                count++;
            }
            int sum=0;
            number=i;
            while(number!=0){
                int digit=number%10;
                sum=sum+armstrong(digit, count);
                number=number/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
