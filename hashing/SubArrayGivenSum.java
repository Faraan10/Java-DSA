package hashing;

import java.util.HashMap;

public class SubArrayGivenSum {
    
    // TC: O(N)
    // SC: O(1)
    // Note: In this problem all the numbers in array A are >=0 
    // Only then this below approach will work as we are using sliding window
    // for sliding window to work the array should be Monotonic in nature 
    // which means expanding window -> sum should always increase
    // shrinking window -> sum should always decrease
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


    // TC: O(N)
    // SC: O(N)
    // Note: In this below method prefix sum + hashMap it will work for 
    // the negative numbers as well
    public int[] optimizedSolve(int[] A, int B) {

        int N=A.length;
        HashMap<Long, Integer> hm=new HashMap<>();
        long prefixSum=0;
        int start=-1;
        int end=-1;

        hm.put(0L, -1); // important storing 0 subarray 

        for(int i=0; i<N; i++){
            prefixSum+=A[i];

            if(hm.containsKey(prefixSum-B)){
                start=hm.get(prefixSum-B)+1;
                end=i;
                break;
            }
            if(!hm.containsKey(prefixSum)){
                hm.put(prefixSum, i);
            }
        }
        if(start==-1){
            return new int[] {-1};
        }
        int[] arr=new int[end-start+1];
        for(int i=start; i<=end; i++){
            arr[i-start]=A[i];
        }
        return arr;
    }
}
