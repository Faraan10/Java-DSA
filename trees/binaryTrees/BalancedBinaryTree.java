package trees.binaryTrees;

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


public class BalancedBinaryTree {
    
    // TC: O(N)
    // SC: O(H)
    public int solve(TreeNode A){

        if(check(A) != -1){ // returning size of binary tree if balanced else -1
            return 1;
        }
        return 0;
    }

    public static int check(TreeNode node){

        if(node==null){
            return 0;
        }

        int left=check(node.left);
        int right=check(node.right);
        if(left==-1 || right==-1){
            return -1;
        }

        if(Math.abs(left-right)> 1){
            return -1;
        }

        return Math.max(left, right)+1;

    }
}   
