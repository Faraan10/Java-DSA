package strings;
import java.util.HashSet;

public class LongestSubStringWithoutRepeat {
    
    public int longestSubStringValue(String S){


        int N=S.length();
        int start=0;
        int max=0;
        // int ansStart=0;
        // int ansEnd=0;
        HashSet<Character> hs=new HashSet<>();

        for(int i=0; i<N; i++){

            while(hs.contains(S.charAt(i))){
                hs.remove(S.charAt(start));
                start++;
            }
            hs.add(S.charAt(i));
            max=Math.max(max, i-start+1);
            // if((i-start+1)>max){
            //     max=Math.max(max, i-start+1);
            //     ansStart=start;
            //     ansEnd=i;
            // }
        }
        return max;
    }

    // TC: O(N)
    // SC: O(N)
    public String longestSubString(String S){


        int N=S.length();
        int start=0;
        int max=0;
        int ansStart=0;
        int ansEnd=0;
        HashSet<Character> hs=new HashSet<>();

        for(int i=0; i<N; i++){

            while(hs.contains(S.charAt(i))){
                hs.remove(S.charAt(start));
                start++;
            }
            hs.add(S.charAt(i));
            if((i-start+1)>max){
                max=Math.max(max, i-start+1);
                ansStart=start;
                ansEnd=i;
            }
        }
        return S.substring(ansStart, ansEnd+1);
    }
}
