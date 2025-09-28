package strings;

public class ToggleCase {
    
    // TC: O(N^2) as we are concanating strings every time when we are creating new string as strings are immutable in java
    // SC: O(N)
    public String solveBrute(String A) {

        int N=A.length();
        String str="";

        for(int i=0; i<N; i++){
            if(A.charAt(i)>='a' && A.charAt(i)<='z'){
                str=str+(char)(A.charAt(i)-32);
            }else{
                str=str+(char)(A.charAt(i)+32);
            }
        }
        return str;
    }

    // TC: O(N)
    // SC: O(N)
    public String solve(String A) {
        
        int N=A.length();
        char[] ch=A.toCharArray();
        for(int i=0; i<N; i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }else{
                ch[i]=(char)(ch[i]-32);
            }
        }
        return new String(ch);
    }
}
