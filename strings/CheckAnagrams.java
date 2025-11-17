package strings;

public class CheckAnagrams {
    
    // TC: O(A or B) which ever is greater ie: if A is greater O(A) else O(B)
    // as we are iterating over them
    // SC: O(1)  =only using constant space of array 26

    // Note: the problem states that the strings are in lower case letters
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
