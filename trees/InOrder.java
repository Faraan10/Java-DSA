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

public class InOrder {
    
    // TC: O(N)
    // SC: O(N)
    public static ArrayList<Integer> solve(TreeNode A){

        ArrayList<Integer> ans=new ArrayList<Integer>();

        InOrderTraverse(A, ans);

        return ans;
    }

    public static void InOrderTraverse(TreeNode node, ArrayList<Integer> list){

        if(node==null){
            return;
        }

        InOrderTraverse(node.left, list);
        list.add(node.val);
        InOrderTraverse(node.right, list);
    }
}
