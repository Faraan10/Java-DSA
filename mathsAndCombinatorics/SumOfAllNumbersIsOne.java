package mathsAndCombinatorics;

public class SumOfAllNumbersIsOne {
    
    
    public static int solve(int A){

        int ans=A;
        while(ans>9){
            ans=sum(A);
        }
        if(ans==1){
            return 1;
        }
        return 0;

    }

    public static int sum(int N){

        int sum=0;
        while(N!=0){
            int ans=N%10;
            sum=sum+ans;
            N=N/10;
        }
        return sum;
    }
}
