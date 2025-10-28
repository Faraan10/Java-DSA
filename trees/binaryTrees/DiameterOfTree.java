package trees.binaryTrees;

public class DiameterOfTree {
    
    int diameter;

    int getMaxLength(TreeNode root){

        if(root==null){
            return 0;
        }

        int leftMax=getMaxLength(root.left);
        int rightMax=getMaxLength(root.right);
        diameter=Math.max(diameter, leftMax+rightMax);
        return 1+ Math.max(leftMax, rightMax);
    }
    public int solve(TreeNode A) {

        diameter=0;
        getMaxLength(A);
        return diameter;
    }   
}
