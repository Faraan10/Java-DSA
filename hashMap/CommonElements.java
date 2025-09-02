package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    

    public int[] solve(int[] A, int[] B) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.

      int N=A.length;
      int M=B.length;

      HashMap<Integer, Integer> hm=new HashMap<>();

      for(int i=0; i<N; i++){
          if(hm.containsKey(A[i])){
              int oldValue=hm.get(A[i]);
              int newValue=oldValue+1;
              hm.put(A[i], newValue);
          }else{
              hm.put(A[i], 1);
          }
      }

      ArrayList<Integer> ans=new ArrayList<>();

      for(int i=0; i<M; i++){
          if(hm.containsKey(B[i])){
              if(hm.get(B[i])>0){
                  int val=hm.get(B[i]);
                  int newVal=val-1;
                  hm.put(B[i], newVal);
                  ans.add(B[i]);
              }
          }
      }

      int[] arr=new int[ans.size()];
      for(int i=0; i<ans.size(); i++){
          arr[i]=ans.get(i);
      }
      return arr;
  }
}
