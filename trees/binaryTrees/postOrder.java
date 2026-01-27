package trees.binaryTrees;

import java.util.ArrayList;

// TreeNode class
class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    // constructor 
    TreeNode(int x){
        x=val;
        left=null;
        right=null;
    }
}


public class postOrder {
    
    // TC: O(N)
    // SC: O(H) or O(N) as it max height of tree
    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        ArrayList<Integer> ans=new ArrayList<>();

        postOrderTraverse(A, ans);

        return ans;
    }

    public static void postOrderTraverse(TreeNode A, ArrayList<Integer> list){

        if(A==null){
            return;
        }

        postOrderTraverse(A.left, list);
        postOrderTraverse(A.right, list);
        list.add(A.val);
    }
}
