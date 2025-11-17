package strings;

public class CheckAnagrams {
    
    public int solve(String A, String B) {

        if(A.length() != B.length()){
            return 0;
        }

        int[] arr=new int[26];

        for(int i=0; i<A.length(); i++){
            char ch=A.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0; i<B.length(); i++){
            char ch=B.charAt(i);
            arr[ch-'a']--;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                return 0;
            }
        }
        return 1;
    }
}
