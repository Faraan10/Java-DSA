package trees.binaryTrees;

import java.util.ArrayList;
import java.util.Stack;

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



    // Inorder Iterative traversal using stack
    // TC: O(N)
    // SC: O(H)
    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=A;

        while(curr != null || !st.isEmpty()){

            // go as left as possible 
            while(curr != null){
                st.push(curr);
                curr=curr.left;
            }

            // process node
            curr=st.pop();
            list.add(curr.val);

            // go to right subtree
            curr=curr.right;
        }
        return list;
    }
}
