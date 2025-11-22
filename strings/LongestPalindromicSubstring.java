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

        int start=0;
        int end=0;

        for(int i=0; i<N; i++){

            int[] oddLength=expandAroundCenter(A, i, i);

            if(oddLength[1]-oddLength[0] > end-start){
                start=oddLength[0];
                end=oddLength[1];
            }

            int[] evenLength=expandAroundCenter(A, i, i+1);

            if(evenLength[1]-evenLength[0] > end-start){
                start=evenLength[0];
                end=evenLength[1];
            }
        }
        return A.substring(start, end+1);
    }
}
