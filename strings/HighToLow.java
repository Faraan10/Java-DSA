package strings;

public class HighToLow {
    
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
