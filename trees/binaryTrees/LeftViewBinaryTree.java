package trees.binaryTrees;

import java.util.ArrayList;

public class LeftViewBinaryTree {
    
    // TC: O(N)
    // SC: O(H)
    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> list=new ArrayList<>();

        leftView(list, A, 0); // here 0 is the current depth level 
                            // for tallying with arraylist size
        return list;
    }

    public void leftView(ArrayList<Integer> list, TreeNode root, int currentDepth){

        if(root==null){
            return;
        }

        if(currentDepth==list.size()){
            list.add(root.val);
        }

        leftView(list, root.left, currentDepth+1);
        leftView(list, root.right, currentDepth+1);
    }
}
