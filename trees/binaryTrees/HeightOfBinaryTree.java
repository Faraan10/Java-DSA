package trees.binaryTrees;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        left=null;
        right=null;
        val=x;
    }
}

public class HeightOfBinaryTree {
    
    public int height(TreeNode root){

        if(root.left==null || root.right==null){
            return 0;
        }

        return height(root.right)+ height(root.left)+1;
    }
}
