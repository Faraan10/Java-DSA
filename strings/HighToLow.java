package strings;

public class HighToLow {
    
    // TC: O(N^2)  because loop runs till (N times) and for every iteration it 
    // creates a new string so again (N times) as strings are immutable in java
    // SC: O(1)
    public String solve(String A) {

       int N=A.length();

       String str="";
       for(int i=0; i<N; i++){
           char ch=A.charAt(i);
           str=str+(char)(ch+32);
       }
       return str;
    }
}
