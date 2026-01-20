package BinarySearch;

public class PaintersPartition {
    
    // TC: O(N log N)
    // SC:O(1)
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
                low=(long)C[i]*B;
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



    // better implementation
    // TC: O(N log N)
    // SC: O(1)

    public boolean isPossibleToPaint(int A, long max_limit, int[] arr){

        int N=arr.length;
        int count=1; // 1st painter
        long sum=0;
        for(int i=0; i<N; i++){
            sum+=arr[i];
            if(sum>max_limit){
                count++;
                sum=arr[i];
            }
            if(count>A){
                return false;
            }
        }
        return true;
    }
    public int betterPaint(int A, int B, int[] C) {

        int N=C.length;
        int max=C[0];
        int sum=C[0];
        for(int i=1; i<N; i++){
            max=Math.max(max, C[i]);
            sum+=C[i];
        }

        long low=max;
        long high=sum;
        long ans=0;
        while(low<=high){

            long mid=low+(high-low)/2;

            if(isPossibleToPaint(A, mid, C)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)(ans*B%10000003);
    }
}
