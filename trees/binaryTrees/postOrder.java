package trees.binaryTrees;

import java.util.ArrayList;

public class postOrder {
    
    // TC: O(N)
    // SC: O(H)
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
