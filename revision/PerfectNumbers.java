package revision;

public class PerfectNumbers {
    
    public int perfectNo(int N){

        int sum=0;

        for(int i=1; i<N; i++){
            if(N%i==0){
                sum=sum+i;
            }
        }
        if(sum==N){
            return 1;
        }
        return 0;
    }
}
