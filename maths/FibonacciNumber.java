package maths;

public class FibonacciNumber {
    
    // Fibonacci problem iterative approach with array
    // TC: O(N)
    // SC: O(N)
    public int Fibonacci(int N){

        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }

        int[] arr=new int[N+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=N; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[N];
    }

    // Fibonacci with less memory space iterative
    // TC: O(N)
    // SC: O(1)
    public int fib(int N){

        int firstPrevious=1;
        int secondPrevious=0;
        int sum=0;

        for(int i=2; i<=N; i++){
            sum=secondPrevious+firstPrevious;
            secondPrevious=firstPrevious;
            firstPrevious=sum;
        }
        return sum;
    }


    // Fibonacci Recursive approach
    public int FiboRecursive(int N){

        if(N<=1){
            return N;
        }

        return FiboRecursive(N-1)+FiboRecursive(N-2);
    }
    


}
