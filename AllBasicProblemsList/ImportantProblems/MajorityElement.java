package AllBasicProblemsList.ImportantProblems;

public class MajorityElement {
    
    public int majorityElement(final int[] A) {

        // TC: O(N)
        // SC: O(N)
        // int N=A.length;
        // HashMap<Integer, Integer> hm=new HashMap<>();

        // for(int i=0; i<N; i++){
        //     hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
        // }

        // int majority=N/2;
        // for(int i=0; i<N; i++){
        //     if(hm.get(A[i])>majority){
        //         return A[i];
        //     }
        // }
        // return 0;

        // TC: O(N log N)
        // SC: O(1)
        // int N=A.length;
        // int count=1;
        // int majority=N/2;

        // Arrays.sort(A);
        // // if(N==1){
        // //     return A[0];
        // // }

        // for(int i=1; i<N; i++){
        //     if(A[i-1]==A[i]){
        //         count++;
        //     }else{
        //         count=1;
        //     }
        //     if(count>majority){
        //         return A[i];
        //     }
        // }
        // return A[0];


        // Moores voting algorithm
        // TC: O(N)
        // SC: O(1)

        int N=A.length;
        int candidate=0;

        int count=0;
        for(int i=0; i<N; i++){

            if(count==0){
                candidate=A[i];
                count=1;
            }else if(candidate==A[i]){
                count++;
            }else{
                count--;
            }
        }

        int countCandidate=0;
        for(int i=0; i<N; i++){
            if(A[i]==candidate){
                countCandidate++;
            }
        }

        if(countCandidate>N/2){
            return candidate;
        }
        return -1;
    }
}
