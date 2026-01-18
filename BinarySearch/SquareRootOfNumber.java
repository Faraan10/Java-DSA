package BinarySearch;

public class SquareRootOfNumber {
    
    public int sqrt(int A) {

        long low=1;
        long high=A;
        long root=0;

        while(low<=high){

            long mid=low+(high-low)/2;

            if(mid*mid==A){
                return (int)mid;
            }else if(mid*mid>A){
                high=mid-1;
            }else{
                root=mid;
                low=mid+1;
            }
        }
        return (int)root;
    }
}
