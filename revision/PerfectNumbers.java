package revision;

public class PerfectNumbers {
    
    // TC: O(N)
    // SC: O(1)
    public int perfectNo(int N){

        int sum=0;

        for(int i=1; i*i<=N; i++){
            if(N%i==0){
                if(i==N/i){
                    sum+=i;
                }else{
                    sum=sum+(i+N/i);
                }
            }
        }
        if(sum==N){
            return 1;
        }
        return 0;
    }

    // TC: O(root N)
    // SC: O(1)
    public int perfectNoOptmized(int N){

        int sum=1;

        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                if(i==N/i){
                    sum+=i;
                }else{
                    sum=sum+(i+N/i);
                }
            }
        }
        if(sum==N){
            return 1;
        }
        return 0;
    }
}
