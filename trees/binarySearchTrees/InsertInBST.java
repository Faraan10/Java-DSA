package trees.binarySearchTrees;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){

        val=x;
        left=null;
        right=null;
    }
}

public class InsertInBST {
    
    public TreeNode solve(TreeNode A, TreeNode B){

        if(A==null){
            return B;
        }

        TreeNode curr=A;

        while(curr != null){

            if(B.val < curr.val){
                if(curr.left == null){
                    curr.left=B;
                    break;
                }
                curr=curr.left;
            }else if(B.val > curr.val){
                if(curr.right == null){
                    curr.right=B;
                    break;
                }
                curr=curr.right;
            }
        }
        return A;
    }

}
