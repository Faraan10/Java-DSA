package strings;

public class ToggleCase {

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
