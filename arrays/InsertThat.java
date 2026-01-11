package arrays;


import java.util.Scanner;

public class InsertThat {
    
    // TC: O(N)
    // SC: O(N)
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int[] arr=new int[N+1]; // taking one extra length to add element Y at position X 

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        int X=sc.nextInt();
        int Y=sc.nextInt();
    
        // this problem constraint is to solve 1-based indexing
        for(int i=arr.length-1; i>=X; i--){
            arr[i]=arr[i-1];
        }
        arr[X-1]=Y;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
        sc.close();       
    }
}
