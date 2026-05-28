package arrays.subarraysAndCarryForward;

public class SubarrayWithGivenSum {
    
    
    public int[] solve(int[] A, int B) {

        int N=A.length;

        int startIdx=0;
        int endIdx=0;
        int sum=0;
        while(endIdx<N){
            sum+=A[endIdx];
            while(sum>B && startIdx<endIdx){
                sum-=A[startIdx];
                startIdx++;
            }
            if(sum==B){
                int length=endIdx-startIdx+1;
                int[] arr=new int[length];
                for(int i=0; i<arr.length; i++){
                    arr[i]=A[startIdx++];
                }
                return arr;
            }
            endIdx++;
        }
        int[] newArr=new int[1];
        newArr[0]=-1;
        return newArr;
    }
}
