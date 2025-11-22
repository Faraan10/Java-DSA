package strings;

public class LongestPalindromicSubstring {
    
    // TC: O(N^2)
    // SC: O(1)
    public int[] expandAroundCenter(String S, int c1, int c2){

        int N=S.length();
        int[] arr=new int[2];
        while((c1>=0 && c2<N) && (S.charAt(c1)==S.charAt(c2))){
            c1--;
            c2++;
        }

        arr[0]=c1+1;
        arr[1]=c2-1;

        return arr;
    }
    public String longestPalindrome(String A) {

        int N=A.length();

        int start=0; // variables to track start and end of longest subtring
        int end=0;

        for(int i=0; i<N; i++){

            // for odd length palindromic substring it will expand from one index only
            // for ex A = "aaaabaaa" output: "aaabaaa" and length is 7 which is odd length substring
            // so we expand from center and go left c1-- and we go right c2++ and check if they are same
            // suppose for b c1-- is a and from b c2++ is a and both are same in above helper function
            int[] oddLength=expandAroundCenter(A, i, i);

            if(oddLength[1]-oddLength[0] > end-start){
                start=oddLength[0];
                end=oddLength[1];
            }


            // for even length palindromic substring it will expand from one index only
            // for ex A = "abba" output: "abba" and length is 4 which is even length substring
            // so we expand from center and we go left c1-- and we go right c2++ and check if they are same
            // suppose for example i=1 which is b and then i+1 =2 which is also b 
            // then we expand from 2 points as it is even length c1-- and c2++
            // so we get a A.charAt(c1) which is a and A.charAt(c2) which is also a and both are same 
            // this continue till either of them is less than 0 or == N
            // then we return an array of length 2 of start and end points of the substring
            // so we return c1+1 and c2-1 inside the output array of helper function as
            // we go till >=0 for c1 and <N for c2 so it will do c1-- and c2++
            // and c1 will react to -1 position and c2 will reach to N position 
            // as both are invlaid we return c1+1 and c2-1
            int[] evenLength=expandAroundCenter(A, i, i+1);

            if(evenLength[1]-evenLength[0] > end-start){
                start=evenLength[0];
                end=evenLength[1];
            }
        }
        return A.substring(start, end+1);
    }
}
