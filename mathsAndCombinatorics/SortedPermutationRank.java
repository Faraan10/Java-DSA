package mathsAndCombinatorics;

public class SortedPermutationRank {
    
    // TC: O(N^2)
    // SC: O(N)
    public int findNthRank(String A){

        int N=A.length();
        long[] fact=new long[N+1];
        fact[0]=1;
        int mod=1000003;

        for(int i=1; i<=N; i++){
            fact[i]=(fact[i-1]*i)%mod;
        }

        long ans=0;
        for(int i=0; i<N; i++){
            int smallerCount=0;
            for(int j=i+1; j<N; j++){
                if(A.charAt(j)<A.charAt(i)){
                    smallerCount++;
                }
            }

            ans=(ans+smallerCount*fact[N-i-1])%mod;
        }

        return (int)((ans+1)%mod);
    }
}
