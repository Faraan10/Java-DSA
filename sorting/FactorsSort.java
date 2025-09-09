package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class FactorsSort {
    
    public static int FactorsCount(int val){

        int count=0;
        for(int i=1; i<=val; i++){
            if(val%i==0){
                count++;
            }
        }
        return count;
    }

    public static int[] SortOnFactorCount(int[] arr){

        Integer[] arr2=new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }

        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2){
                int a=FactorsCount(val1);
                int b=FactorsCount(val2);

                if(a==b){
                    return val1-val2;
                }else{
                    return a-b;
                }
            }
        });

        int[] result=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i]=arr2[i];
        }
        
        return result;
    }

    public int[] solve(int[] A) {

        return SortOnFactorCount(A);
    }
}
