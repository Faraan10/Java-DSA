package arrays;

public class DutchNationalFlag {
    
    // TC: O(N)
    // SC: O(N) using and array returning as output
    // Auxiliary space: O(N) no additional space excluding input and output
    public int[] sortColors(int[] A) {

        int N=A.length;

        int[] arr=new int[N];

        int red=0;
        int white=0;
        int blue=0;
        for(int i=0; i<N; i++){
            if(A[i]==0){
                red++;
            }else if(A[i]==1){
                white++;
            }else{
                blue++;
            }
        }

        int index=0;
        for(int i=0; i<red; i++){
            arr[i]=0;
            index++;
        }
        
        for(int i=0; i<white; i++){
            arr[index]=1;
            index++;
        }
        for(int i=0; i<blue; i++){
            arr[index]=2;
            index++;
        }
        return arr;
    } 
}
