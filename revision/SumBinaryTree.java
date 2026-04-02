package revision;

public class SumBinaryTree {

    class TreeNode{

        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int x){
            val=x;
            left=null;
            right=null;
        }
    }
    
    
    public int solve(TreeNode A) {
        
        if(A==null){
            return 1;
        }

        if(A.left==null && A.right==null){
            return 1;
        }

        if(sum(A) != -1){
            return 1;
        }
        return 0;
    }

    public int sum(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftSum=sum(root.left);
        int rightSum=sum(root.right);

        if((root.left==null && root.right==null) || (leftSum!=-1 && rightSum!=-1 && leftSum+rightSum==root.val)){
            return root.val+leftSum+rightSum;
        }
        return -1;
    }
}
