package strings;

public class AmazingSubarrays {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(String A) {

        int N=A.length();
        int length=0;

        for(int i=0; i<N; i++){
            char ch=A.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                length=(length%10003)+((A.length()-1)-i+1);
            }
        }
        return length%10003;
    }
}
