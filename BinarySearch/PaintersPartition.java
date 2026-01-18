package BinarySearch;

public class PaintersPartition {
    
    
    public static boolean isPossible(int P, int V, long mid, int[] arr){

        int N=arr.length;
        long sum=0;
        int painters=1;
        for(int i=0; i<N; i++){

            long time=(long)arr[i]*V;
            if(time>mid){
                return false;
            }

            if(sum+time>mid){
                painters++;
                sum=time;
                if(painters>P){
                    return false;
                }
            }else{
                sum+=time;
            }
        }
        return true;
    }
    public int paint(int A, int B, int[] C) {

        int N=C.length;

        long low=0;
        long high=0;
        long ans=Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if((long)C[i]*B>low){
                low=C[i]*B;
            }
            high+=(long)C[i]*B;
        }

        while(low<=high){

            long mid=low+(high-low)/2;

            if(isPossible(A, B, mid, C)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)(ans%10000003);
    }
}
