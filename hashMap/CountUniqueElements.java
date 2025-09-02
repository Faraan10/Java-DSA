package hashMap;

import java.util.HashMap;

public class CountUniqueElements {
    
    public int solve(int[] A) {

        int N=A.length;

        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();

        for(int i=0; i<N; i++){
            if(hm.containsKey(A[i])){
                int value=hm.get(A[i]);
                int newValue=value+1;
                hm.put(A[i], newValue);
            }else{
                hm.put(A[i], 1);
            }
        }

        int count=0;
        for(int i=0; i<N; i++){
            if(hm.get(A[i])==1){
                count++;
            }
        }
        return count;
    }
}
