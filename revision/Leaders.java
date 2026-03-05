package revision;

import java.util.ArrayList;

public class Leaders {
    
    // TC: O(N)
    // SC: O(M) which is no of leaders in the array
    // but this problem uses Arraylist which has an overhead for converting
    // it into wrapper classes int-> Integer 
    public int[] solve(int[] A) {

        int N=A.length;

        ArrayList<Integer> list=new ArrayList<>();
        list.add(A[N-1]);
        int max=A[N-1];
        for(int i=N-2; i>=0; i--){
            if(A[i]>max){
                list.add(A[i]);
                max=A[i];
            }
        }

        int[] arr=new int[list.size()];
        int M=arr.length;
        for(int i=0; i<M; i++){
            arr[i]=list.get(M-i-1);
        }
        return arr;
    }



    // solved without the use of dynamic arrays
    // TC: O(N)
    // SC: O(N)
    // this is slightly faster in execution when compared to above approach
    // as this one uses static arrays but SC increases a bit
    public int[] staticArraySolve(int[] A) {

        int N=A.length;
        int[] arr=new int[N];
        int count=0;
        arr[count++]=A[N-1];
        int max=A[N-1];

        for(int i=N-2; i>=0; i--){
            if(A[i]>max){
                arr[count++]=A[i];
                max=A[i];
            }
        }

        int[] res=new int[count];
        int M=res.length;
        for(int i=0; i<M; i++){
            res[i]=arr[M-i-1];
        }
        return res;
    }
}
