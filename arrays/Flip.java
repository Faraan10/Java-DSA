package arrays;

public class Flip {
    
    public int[] flip(String A) {

        int N=A.length();
        int[] arr=new int[2];
        int maxSum=0;
        int currSum=0;
        int startIdx=0;
        int endIdx=0;
        int tempStart=0;
        for(int i=0; i<N; i++){
            if(currSum<0){
                currSum=0;
                tempStart=i;
            }
            if(A.charAt(i)=='0'){
                currSum+=1;
            }else{
                currSum-=1;
            }
            if(currSum>maxSum){
                maxSum=currSum;
                startIdx=tempStart;
                endIdx=i;
                arr[0]=startIdx+1;
                arr[1]=endIdx+1;
            }
        }
        if(maxSum==0){
            return new int[] {};
        }
        return arr;
    }
}
