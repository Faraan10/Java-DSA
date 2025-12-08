package strings;

public class CountOccurences {
    
    public int solve(String A) {

        int N=A.length();
        int count=0;

        int i=0;
        int j=2;
        while(j<N){
            if(A.substring(i, j+1).equals("bob")){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}
