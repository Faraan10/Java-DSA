package revision;

public class HeightOfTree {
    
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

    public int HeightOfTheTree(TreeNode A){

        return solve(A);
    }

    public int solve(TreeNode root){

        if(root==null){
            return 0;
        }

        int left=solve(root.left);
        int right=solve(root.right);
        return Math.max(left, right)+1;
    }
}
