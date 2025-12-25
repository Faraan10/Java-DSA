package maths;

import java.util.Scanner;

public class PalindromicInteger {

    

    // TC: O(N)
    // SC: O(1)

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        // TC :O(log A)
        // SC: O(1)
        int N=sc.nextInt();

        int A=N;
        int remainder=0;
        while(A!=0){
            int digit=A%10;
            remainder=remainder*10+digit;
            A=A/10;
        }
        if(remainder==N){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        // TC: O(log N)
        // SC: O(lon N)
        // boolean isPalin=true;
        // String str=Integer.toString(N); because of this extra space

        // for(int i=0; i<str.length()/2; i++){
        //     if((str.charAt(i) != (str.charAt(str.length()-1-i)))){
        //         isPalin=false;
        //         break;
        //     }else{
        //     }
        // }
        // if(isPalin){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        sc.close();
    }

}
