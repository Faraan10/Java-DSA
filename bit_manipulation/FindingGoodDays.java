package bit_manipulation;

public class FindingGoodDays {
    // TC: O( log A)
    // SC: O(1)
    public int solve(int A) {

        int count=0;
        while(A!=0){
            A= A& (A-1); // clearing lowest set bit
            count++;
        }

        return count;
    }
}
