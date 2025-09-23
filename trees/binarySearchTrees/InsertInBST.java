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

public class InsertInBST {
    
    public TreeNode solve(TreeNode A, TreeNode B){

        if(A==null){
            return B;
        }

        TreeNode curr=A;

        while(curr != null){

            if(B.val < curr.val){
                if(curr.left == null){
                    curr.left=B;
                    break;
                }
                curr=curr.left;
            }else if(B.val > curr.val){
                if(curr.right == null){
                    curr.right=B;
                    break;
                }
                curr=curr.right;
            }
        }
        return A;
    }

}



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     TC: O(h)
//     SC: O(h) for recursion stack
//     public TreeNode insertIntoBST(TreeNode root, int val) {
        
//         TreeNode temp=root;
//         TreeNode node=new TreeNode();

//         if(root==null){
//             return new TreeNode(val);
//         }

//         if(root.val < val){
//             root.right=insertIntoBST(root.right, val);
//         }else{
//             root.left=insertIntoBST(root.left, val);
//         }

//         return root;
//     }
// }