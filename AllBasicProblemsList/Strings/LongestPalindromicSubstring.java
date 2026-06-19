package AllBasicProblemsList.Strings;

public class LongestPalindromicSubstring {
    
    // TC: O(N^2)
    // SC: O(1)
    // This method is called as expand around center
    public int[] expandAroundCenter(String str, int start, int end){

        int N=str.length();
        int i=start;
        int j=end;
        while(i>=0 && j<N){
            if(str.charAt(i)==str.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }
        }
        int[] arr=new int[2];
        arr[0]=i+1;
        arr[1]=j-1;
        return arr;
    }
    public String longestPalindrome(String A) {

        int N=A.length();
        int start=0;
        int end=0;

        for(int i=0; i<N; i++){

            int[] odd=expandAroundCenter(A, i, i);

            int[] even=expandAroundCenter(A, i, i+1);

            if(odd[1]-odd[0]>end-start){
                start=odd[0];
                end=odd[1];
            }

            if(even[1]-even[0]>end-start){
                start=even[0];
                end=even[1];
            }
        }
        return A.substring(start, end+1);
    }
}
