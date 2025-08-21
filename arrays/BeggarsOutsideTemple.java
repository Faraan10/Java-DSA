package arrays;

public class BeggarsOutsideTemple {

    // smaller version with 2 queries start point and value
    // i.e: A=5, B=[[1,10], [2,20], [3,25]] and 1 based indexing
    // output: 10,30,55,55,55

    // TC: O(N+Q)
    // SC: O(1)
    // public int[] ContinousSumQuery(int A, int[][] B){
        
    //     int[] arr=new int[A];

    //     for(int i=0; i<B.length; i++){
    //         int idx=B[i][0];
    //         int val=B[i][1];
    //         // as it is 1 based indexing the index values in B will
    //         // start from 1 so doing --idx to get the exact index in arr
    //         arr[--idx]+=val;
    //     }

    //     for(int i=1; i<arr.length; i++){
    //         arr[i]=arr[i-1]+arr[i];
    //     }
    //     return arr;
    // }
    

    // Beggars Outside Temple problem
    // TC: O(N+Q) N= array length  Q=Queries length
    //SC: O(1)
    // Note: This implementation is 1 based indexing
    public int[] ContinousSumQuery(int A, int[][] B){

        int[] array=new int[A];

        for(int i=0; i<B.length; i++){
            int idx=B[i][0];
            int value=B[i][2];
            array[--idx]+=value;
        }

        for(int i=0; i<B.length; i++){
            int idx=B[i][1];
            int value=B[i][2];
            if(idx<A){
                array[idx]-=value;
            }
        }

        for(int i=1; i<array.length; i++){
            array[i]=array[i-1]+array[i];
        }

        return array;
    }
}
