package maths;

import java.util.Scanner;

public class PalindromicInteger {

    public static void main(String[] args) {
    
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
