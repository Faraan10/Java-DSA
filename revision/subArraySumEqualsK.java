package revision;

public class subArraySumEqualsK {
    
    public int sumEqualsK(int[] arr, int K){

        int N=arr.length;
        int ans=0;

        for(int i=0; i<N; i++){
            int sum=0;
            for(int j=i; j<N; j++){
                sum=sum+arr[j];
                if(sum==K && j-i+1>ans){
                    ans=j-i+1;
                }
            }
        }

        return ans;
    }
}
