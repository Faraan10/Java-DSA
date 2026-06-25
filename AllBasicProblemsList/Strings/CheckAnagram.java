package AllBasicProblemsList.Strings;

public class CheckAnagram {
    
    public int solve(String A, String B) {

        if(A.length() != B.length()){
            return 0;
        }

        int N=A.length();
        int M=B.length();
        int[] arr=new int[26];

        for(int i=0; i<N; i++){
            arr[A.charAt(i)-'a']++;
        }
        for(int i=0; i<M; i++){
            arr[B.charAt(i)-'a']--;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                return 0;
            }
        }
        return 1;
    }
}
