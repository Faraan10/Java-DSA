package mathsAndCombinatorics;

public class SumOfAllNumbersIsOne {
    
    // when 1<=A<=10 power 9
    // TC: O(log10 A) as we are dividing 10 at every step we do atmosr 9 operations 
    // so TC: O(1) so constant time used
    // SC: O(1)
    public static int solve(int A){

        int ans=A;
        while(ans>9){
            ans=sum(ans);
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
