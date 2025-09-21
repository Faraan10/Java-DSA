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

    // TC: O(H) it goes down every level so in worst cases it goes down to O(H) height of tree
    // SC: O(1)  no space used
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