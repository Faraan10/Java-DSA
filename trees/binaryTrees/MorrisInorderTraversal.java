package trees.binaryTrees;

import java.util.ArrayList;

public class MorrisInorderTraversal {
    
    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> list=new ArrayList<>();

        TreeNode curr=A;

        while(curr != null){

            if(curr.left != null){
                TreeNode pre=curr.left;
                while(pre.right != null && pre.right != curr){
                    pre=pre.right;
                }
                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }else{
                    pre.right=null;
                    list.add(curr.val);
                    curr=curr.right;
                }
            }else{
                list.add(curr.val);
                curr=curr.right;
            }
        }
        return list;
    }
}
