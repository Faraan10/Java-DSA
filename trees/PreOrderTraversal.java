package trees;

import java.util.ArrayList;


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

public class PreOrderTraversal {
    
    public static ArrayList<Integer> PreOrder(TreeNode A){

        ArrayList<Integer> ans=new ArrayList<>();

        Ordering(A, ans);

        return ans;
    }

    public static void Ordering(TreeNode node, ArrayList<Integer> ans){

        if(node==null){
            return;
        }

        ans.add(node.val);
        Ordering(node.left, ans);
        Ordering(node.right, ans);
    }
}
