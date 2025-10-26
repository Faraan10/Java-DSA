package trees.binarySearchTrees;

public class KthSmallest {
    
    // TC: O(N)
    // SC: O(h)

    // these below are global variables
    int count=0;
    int data=-1;
    int prev=Integer.MIN_VALUE;

    public int kthsmallest(TreeNode A, int B) {

        Inorder(A, B);
        return data;
    }

    public void Inorder(TreeNode A, int B){

        if(A==null){
            return;
        }

        Inorder(A.left, B);

        if(A.val != prev){
            count=count+1;
            prev=A.val;
            if(count==B){
                data=A.val;
                return;
            }
        }
        Inorder(A.right, B);
    }
}
