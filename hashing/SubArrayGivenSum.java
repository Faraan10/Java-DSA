package hashing;

public class SubArrayGivenSum {
    
    // TC: O(N)
    // SC: O(1)
    public int[] solve(int[] A, int B) {

        int N=A.length;

        int left=0;
        int sum=0;
        int start=-1;
        int end=-1;
        boolean isFound=false;
        for(int right=0; right<N; right++){
            sum+=A[right];
            while(sum>B){
                sum-=A[left];
                left++;
            }
            if(sum==B){
                start=left;
                end=right;
                isFound=true;
                break;
            }
        }
        if(!isFound){
            int[] arr=new int[1];
            arr[0]=-1;
            return arr;
        }

        int[] arr=new int[end-start+1];
        int count=0;
        for(int i=start; i<=end; i++){
            arr[count++]=A[i];
        }
        return arr;
    }
}
