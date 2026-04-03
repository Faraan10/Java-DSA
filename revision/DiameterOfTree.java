package revision;

public class DiameterOfTree {
    
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

    // TC: O(N)
    // SC: O(H)
    static int diameter=0;
    public int diameter(TreeNode A){

        solve(A);
        return diameter;
    }

    public int solve(TreeNode root){

        if(root==null){
            return 0;
        }

        int left=solve(root.left);
        int right=solve(root.right);

        diameter=Math.max(diameter, left+right);
        return Math.max(left, right)+1;
    }
}
