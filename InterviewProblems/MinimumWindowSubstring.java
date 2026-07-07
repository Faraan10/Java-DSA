package InterviewProblems;

public class MinimumWindowSubstring {
    
    // This below is a sliding window approach
    // used arrays instead of hashmap to save space 

    // TC: O(A+B)
    // SC: O(1)
    public String minWindow(String A, String B) {

        if(A.length() < B.length()){
            return "-1";
        }

        int[] need=new int[128];
        int[] window=new int[128];

        // keeping track of all the frequencies of B
        for(int i=0; i<B.length(); i++){
            need[B.charAt(i)]++;
        }

        int left=0;
        int formed=0;
        int required=B.length();

        int minLength=Integer.MAX_VALUE;
        int start=-1;

        for(int right=0; right<A.length(); right++){

            char current=A.charAt(right);
            window[current]++;

            if(need[current]>0 && window[current]<=need[current]){
                formed++;
            }

            while(formed==required){

                if(right-left+1<minLength){
                    minLength=right-left+1;
                    start=left;
                }

                char leftChar=A.charAt(left);
                window[leftChar]--;

                if(need[leftChar]>0 && window[leftChar]<need[leftChar]){
                    formed--;
                }
                left++;
            }
        }
        if(start==-1){
            return "-1";
        }
        return A.substring(start, start+minLength);
    }

}
