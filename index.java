public class index {

    public boolean palin(String str, int start, int end){

        if(start>=end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return palin(str, start+1, end-1);
    }

    public int palindrome(String S){

        int N=S.length();

        boolean flag=palin(S, 0, N-1);

        if(flag){
            return 1;
        }
        return 0;
    }
}
