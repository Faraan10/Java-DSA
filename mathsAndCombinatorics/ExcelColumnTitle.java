package mathsAndCombinatorics;

public class ExcelColumnTitle {
    
    // TC: O(log A)
    // SC: O(1)
    public String convertToTitle(int A) {

        StringBuilder sb=new StringBuilder();

        while(A!=0){

            A=A-1;
            int rem=A%26;
            sb.append((char)('A'+rem));
            A=A/26;
        }
        return sb.reverse().toString();
    }
}
