package bit_manipulation;

public class SetBits {

    // TC: O(N) 1 loop till N-1
    // SC: O(1) no addition space used
    public int numSetBits(int A) {

        int count=0;

        for(int i=0; i<32; i++){
            if((A & (1<<i))!=0){
                count++;
            }
        }
        return count;
    }
}
