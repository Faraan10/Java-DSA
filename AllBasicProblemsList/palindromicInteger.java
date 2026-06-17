package AbasicProblemsList;

import java.util.Scanner;

public class palindromicInteger {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
       
        // int A=N;
        // int remainder=0;
        // while(A!=0){
        //     int digit=A%10;
        //     remainder=remainder*10+digit;
        //     A=A/10;
        // }
        // if(remainder==N){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }

        // TC: O(N)
        // SC: O(1)

        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        boolean isPalin=true;
        String str=Integer.toString(N);

        for(int i=0; i<str.length()/2; i++){
            if((str.charAt(i) != (str.charAt(str.length()-1-i)))){
                isPalin=false;
                break;
            }else{
            }
        }
        if(isPalin){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
