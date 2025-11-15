package maths;

public class PerfectNumbers {

    // brute force approach
    // TC: O(A)
    // SC: O(1)
    // public int solve(int A) {

    //     int ans=0;
    //     for(int i=1; i<A; i++){
    //         if(A%i==0){
    //             ans+=i;
    //         }
    //     }
    //     if(ans==A){
    //         return 1;
    //     }
    //     return 0;
    // }
    
    // TC: O(root A)
    // SC: O(1)
    public int optimizedSolve(int A) {

        if(A<=2){
            return 0;
        }
        
        int ans=0;

        for(int i=1; i*i<=A; i++){

            if(A%i==0){
                if(i!=A && A!= A/i){
                    ans+=i+A/i;
                }else{
                    ans+=i;
                }
            }
        }
        if(ans==A){
            return 1;
        }
        return 0;
    }
}
