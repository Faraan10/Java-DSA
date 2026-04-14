package revision;

public class SumOfNodesInTree {
    
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
    public int sumOfNodes(TreeNode A){

        return solve(A);
    }

    public int solve(TreeNode root){

        if(root==null){
            return 0;
        }

        int left=solve(root.left);
        int right=solve(root.right);
        return left+right+root.val;
    }





    // TC: O(N)
    // SC: O(H)
    public int sum(TreeNode A){

        return sumNodes(A);
    }

    public int sumNodes(TreeNode root){

        if(root==null){
            return 0;
        }

        int left=sumNodes(root.left);
        int right=sumNodes(root.right);

        return left+right+root.val;
    }
}
