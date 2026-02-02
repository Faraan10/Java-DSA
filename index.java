public class index {

    // public boolean palin(String str, int start, int end){

    //     if(start>=end){
    //         return true;
    //     }

    //     if(str.charAt(start) != str.charAt(end)){
    //         return false;
    //     }
    //     return palin(str, start+1, end-1);
    // }

    // public int palindrome(String S){

    //     int N=S.length();

    //     boolean flag=palin(S, 0, N-1);

    //     if(flag){
    //         return 1;
    //     }
    //     return 0;
    // }

    // public int maxEle(int[] A){
    //     return 0;
    // }


    // // 24-01-2025
    // // parameterized way of writing recurion
    // public int sumOfN(int sum, int i){
        
    //     if(i<1){
    //         return sum;
    //     }

    //     return sumOfN(sum+i, i-1);
        
    // }
    // public int sum(int N){

    //     return sumOfN(0, N);
    // }

    // // functional way of writing recursive code
    // public int sumOfNumbers(int N){ 

    //     if(N==0){
    //         return 1;
    //     }
    //     return N+sumOfNumbers(N-1);
    // }
    // // suppose N=3,
    // // 3 + sumOfNumbers(3-1) -> so 3 + something it does not know yet 
    // // so it waits for that to return and calculates
    // // so now as sumOfNumbers(N-1) it calls the same function but with value 
    // // of N now is N-1 which is 2
    // // 2 + sumOfNumbers(2-1);
    // // Now value of N is 1 
    // // so it hits the base case 1==1 and returns 1 back to sumOfNumbers(2-1) 
    // // which is 1  and adds 2+1=3 and returns it to sumOfNumbers(3-1) value 3
    // // tehn finally it returns 3+3=6 as output

    // public void reverse(int start, int[] arr, int end){

    //     if(start>=end){
    //         return;
    //     }   
    //     int temp=arr[start];
    //     arr[start]=arr[end];
    //     arr[end]=temp;

    //     reverse(start+1, arr, end-1);
    // }
    // public int[] reverseArray(int[] arr){

    //     reverse(0, arr, arr.length-1);
    //     return arr;
    // }


    // // TC: O(log A)
    // // SC: O(1)
    // public int reverseNumber(int A){

    //     int N=A;
    //     int remainder=0;
    //     while(N!=0){

    //         int digit=N%10;
    //         remainder=remainder*10+digit;
    //         N=N/10;
    //     }

    //     if(remainder==A){
    //         return 1;
    //     }
    //     return 0;
    // }

    public void Numbers(int i, int N){

        if(i==N){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        Numbers(i+1, N);

    }
    // public void printNumbers(int N){
    //     Numbers(1, N);
    // }

    // same problem without helper function
    public void printNumbers(int N){
        
        if(N==0){
            return;
        }
        printNumbers(N-1);
        System.out.print(N+" ");
    }

    public static void main(String[] args){

        index s1=new index();

        s1.printNumbers(10);

    }
}
