package hashing;

import java.util.HashSet;

public class LongestSubstring { // without repeat
    // TC: O(N)
    // SC: O(N) using hashset
    public int lengthOfLongestSubstring(String A) {

        HashSet<Character> hs=new HashSet<>();

        int start=0;
        int i=0;
        int max=0;

        while(i<A.length()){

            while(hs.contains(A.charAt(i))){
                hs.remove(A.charAt(start));
                start++;
            }
            hs.add(A.charAt(i));
            max=Math.max(max, i-start+1);
            i++;
        }
        return max; 
    }

}
