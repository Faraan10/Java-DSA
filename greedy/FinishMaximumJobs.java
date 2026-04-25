import java.util.Arrays;

class FinishMaximumJobs{


    // TC :O(N log N)
    // SC: O(N)
    public int solve(int[] A, int[] B) {
        
        int N=A.length;
        int[][] jobs=new int[N][2];

        for(int i=0; i<N; i++){

            jobs[i][0]=A[i]; // start times
            jobs[i][1]=B[i]; // end times
        }

        Arrays.sort(jobs, (a,b)-> a[1]-b[1]);

        int ans=1; // starting at first job
        int lastEnd=jobs[0][1];
        for(int i=1; i<N; i++){

            if(jobs[i][0]>=lastEnd){
                ans++;
                lastEnd=jobs[i][1];
            }
        }
        return ans;
    }
}