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

public class SearchInBST{

    public int solve(TreeNode A, int B){

        while(A!=null){

            if(A.val == B){
                return 1;
            }
            else if(A.val < B){
                A=A.right;
            }else{
                A=A.left;
            }
        }
        return 0;
    }

}