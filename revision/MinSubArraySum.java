package revision;

public class MinSubArraySum {
    
    public int subarraySum(int[] A, int target){

        int N=A.length;
        int left=0;
        int sum=0;
        int ans=0;
        int length=0;
        for(int right=0; right<N; right++){
            sum+=A[right];

            while(sum>=target && left<=right){
                sum=sum-A[left];
                left++;
            }
            if(sum>=target){
                length=right-left+1;
                if(length<ans){
                    ans=length;
                }
            }
        }
        return length;
    }
}
