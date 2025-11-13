package prefix_sum;

public class EquilibriumIndex {
    
    // TC: O(N^2)
    // SC: O(1)
    // brute force approach
    public int solve(int[] A) {

        int N=A.length;
        int ans=-1;

        for(int i=0; i<N; i++){
            int beforeSum=0;
            int afterSum=0;

            for(int j=0; j<i; j++){
                beforeSum+=A[j];
            }

            for(int j=i+1; j<N; j++){
                afterSum+=A[j];
            }
            if(beforeSum==afterSum){
                return i;
            }
        }
        return ans;
    }

    

    // optimzed approach with prefix sum
    // TC: O(N) 
    // SC: O(N) here as i am using prefix array so SC: O(N)
    public int prefix(int[] A) {

        int N=A.length;

        int[] arr=new int[N];
        arr[0]=A[0];
        for(int i=1; i<N; i++){
            arr[i]=arr[i-1]+A[i];
        }

        int totalSum=arr[N-1];
        for(int i=0; i<N; i++){
            int leftSum=0;
            if(i==0){
                leftSum=0;
            }else{
                leftSum=arr[i-1];
            }
            int rightSum=totalSum-leftSum-A[i];

            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }


    // here is the most optimized approach by using running sum so no additional 
    // space as I am avoiding prefix array storing

    public int optimizedPrefix(int[] A){

        int N=A.length;
        int totalSum=0;
        for(int i=0; i<N; i++){
            totalSum+=A[i];
        }

        int leftSum=0;
        for(int i=0; i<N; i++){

            int rightSum=totalSum-leftSum-A[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=A[i];
        }

        return -1;
    }
}
