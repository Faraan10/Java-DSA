package recursion;

public class Palindrome {
    
    public int check(String S, int start, int end){

        if(start>=end){
            return 1;
        }

        if(S.charAt(start) != S.charAt(end)){
            return 0;
        }
        return check(S, start+1, end-1);
    }

    public int solve(String A) {

        int start=0;
        int end=A.length()-1;

        return check(A, start, end);

    }
}
