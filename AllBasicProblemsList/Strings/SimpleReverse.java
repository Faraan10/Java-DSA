package AllBasicProblemsList.Strings;

public class SimpleReverse {
    
    // TC: O(N)
    // SC: O(N) extra due to char array
    // Note: In java strings are immutable so when we append
    // add a character to string etc it will create a new 
    // string everytime so time complexity will be O(N^2)
    // so we use char array instead of stringbuilder
    // and so that is why we have extra space (N)
    public String solve(String A) {

        // bruteforce
        // int N=A.length();
        // String str="";
        // for(int i=0; i<N; i++){
        //     str=A.charAt(i)+str;
        // }
        // return str;

        
        // using stringbuilder
        // StringBuilder sb=new StringBuilder(A);

        // return sb.reverse().toString();

        
        // using char array
        int N=A.length();
        char[] arr=A.toCharArray();
        int i=0;
        int j=N-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }


    // TC: O(N)
    // SC: O(N)
    public String stringBuilderSolve(String A) {

        StringBuilder sb=new StringBuilder(A);

        return sb.reverse().toString();
    }
}
