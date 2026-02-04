import java.util.Scanner;
import java.util.ArrayList;

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

    // from 1 to N
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
    // from N to 1
    public void printNoReverse(int N){

        if(N==0){
            return;
        }
        System.out.print(N+" ");
        printNoReverse(N-1);
    }

    // TC: O(N)
    // SC: O(N) auxillary stack space
    public int sumOfNo(int N){

        if(N==0){
            return 0;
        }
        // this always calculates sum when backtracking
        // this is also called as post-order/backtracking computation
        // we dont track this we just trust the return values
        // this is functional way of writing code
        return sumOfNo(N-1)+N;
    }

    // check if array is sorted or not using recursion
    // TC: O(N)
    // SC: O(N)
    // public int sortedArray(int i, int j, int[] arr){

    //     if(j==arr.length){
    //         return 1;
    //     }
    //     if(arr[i]>arr[j]){
    //         return 0;
    //     }
    //     return sortedArray(i+1, j+1, arr);
    // }

    public boolean sortedArray(int idx, int[] arr){

        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            return false;
        }

        return sortedArray(idx+1, arr);
    }
    public boolean arraySortedRecursive(int[] arr){

        // System.out.println(sortedArray(0, 1, arr));   
        if(arr.length<=1){
            return true;
        }
        return sortedArray(0, arr);
    }

    public int firstIndexOfElement(int idx, int[] arr, int key){

        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==key){
            return idx;
        }
        return firstIndexOfElement(idx+1, arr, key);
    }
    public int firstIndex(int[] arr, int key){

        return firstIndexOfElement(0, arr, key);
    }


    public int lastIndexOfEle(int idx, int[] arr, int val){

        if(idx<0){
            return -1;
        }
        if(arr[idx]==val){
            return idx;
        }
        return lastIndexOfEle(idx-1, arr, val);
    }
    public int lastIndex(int[] arr, int val){

        return lastIndexOfEle(arr.length-1, arr, val);
    }


    public void allOccurences(int idx, int[] arr, ArrayList<Integer> ans, int key){

        if(idx==arr.length){
            return;
        }

        if(arr[idx]==key){
            ans.add(idx);
        }
        
        allOccurences(idx+1, arr, ans, key);
    }

    public int[] finAllOccurences(int[] arr, int key){

        ArrayList<Integer> ans=new ArrayList<>();
        allOccurences(0, arr, ans, key);

        int[] A=new int[ans.size()];
        if(ans.size()==0){
            int[] res=new int[1];
            res[0]=-1;
            return res;
        }
        for(int i=0; i<A.length; i++){
            A[i]=ans.get(i);
        }
        return A;
    }

    public static void main(String[] args){

        index s1=new index();

        // s1.printNumbers(10);
        // s1.printNoReverse(10);

        // System.out.println(s1.sumOfNo(5));
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        s1.arraySortedRecursive(arr);
        sc.close();
    }

    // TC: O(N)
    // SC: O(N)
    public int factorial(int N){

        if(N==0){
            return 1;
        }

        return factorial(N-1)*N;
    }


    // TC: O(2^N) because we are computing same values 2 to 3 times 
    // so TC grows exponentionally
    // SC: O(N)
    public int fibonacci(int N){

        if(N<=1){
            return N;
        }

        return fibonacci(N-1)+fibonacci(N-2);
    }

    // Tree class
    class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

        // constructor
        TreeNode(int x){
            data=x;
            left=null;
            right=null;
        }
    }

    public ArrayList<Integer> preOrderTraversal(TreeNode A){

        if(A==null){
            ArrayList<Integer> li=new ArrayList<>();
            return li;
        }
        ArrayList<Integer> list=new ArrayList<>();
        preOrder(list, A);
        return list;
    }

    public void preOrder(ArrayList<Integer> list, TreeNode root){

        if(root==null){
            return;
        }

        list.add(root.data);
        preOrder(list, root.left);
        preOrder(list, root.right);
    }

    public int prime(int N){

        if(N<=1){
            return 0;
        }
        int count=0;
        for(int i=1; i<=N; i++){
            if(isPrime(N)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int N){

        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}


