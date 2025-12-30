package hashing;

public class SubArrayGivenSum {
    
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
        if((start==-1 && end==-1) || isFound==false){
            int[] a=new int[1];
            a[0]=-1;
            return a;
        }
        int[] arr=new int[end-start+1];

        for(int i=0; i<arr.length; i++){
            arr[i]=A[start++];
        }
        return arr;
    }
}
