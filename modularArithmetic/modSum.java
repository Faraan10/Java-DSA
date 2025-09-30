package modularArithmetic;

public class modSum {
    
    static final int MOD = 1000000007;
    public int solve(int[] A) {

        int N=A.length;
        int[] freq = new int[1001];

        // Step 1: Build frequency array
        for(int i=0; i<N; i++){
            freq[i]++;
        }

        long ans = 0;

        // Step 2: Calculate contributions
        for (int a = 1; a <= 1000; a++) {
            if (freq[a] == 0) continue;

            for (int b = 1; b <= 1000; b++) {
                if (freq[b] == 0) continue;

                ans += (long)(a % b) * freq[a] * freq[b];
                if (ans >= (long)MOD * MOD) ans %= MOD; // to avoid overflow
            }
        }

        return (int)(ans % MOD);
    }
}
