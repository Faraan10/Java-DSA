package trees.binaryTrees;

public class PathSum {
    
    public int hasPathSum(TreeNode A, int B) {

        if(A==null){
            return 0;
        }

        if(A.left==null && A.right==null && A.val==B){
            return 1;
        }

        int left=hasPathSum(A.left, B-A.val);
        int right=hasPathSum(A.right, B-A.val);

        if(left==1 || right==1){
            return 1;
        }
        return 0;
    }
}
