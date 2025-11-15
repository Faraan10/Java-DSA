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


    // Note: prblem explicitly states that the given string contains only 
    // uppercase alphabets so no need to apply if condition
    // This is an optimized solution with 
    // TC: O(N)
    // SC: O(N) using char array as we must use at least O(N) space because strings are immutable in java.
    public String optimezedSolve(String A) {

        char[] arr=A.toCharArray(); // converting it to char array
        int N=arr.length;
        
        for(int i=0; i<N; i++){
            arr[i]=(char)((int)arr[i]+32); // this is explicit type casting
            // first explicitly converting char to int to add 32 to it as it is char array
            // then again converting it into char and then storing in charArray
        }
        return new String(arr); // here we have to return a new string
    }
}
