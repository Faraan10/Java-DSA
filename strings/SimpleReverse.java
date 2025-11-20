package strings;

public class SimpleReverse {
    
    // TC: O(N)
    // SC: O(N)
    public String solve(String A) {

        char[] arr=A.toCharArray();

        int start=0;
        int end=arr.length-1;

        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
