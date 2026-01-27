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

public class PreOrderTraversal {

    // TC: O(A)
    // SC: O(A) recursion stack space
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


    // Iterative approach for preorder traversal using stack data structure
    // TC: O(N)
    // SC: O(N)
    public ArrayList<Integer> preOrderIterative(TreeNode A){

        ArrayList<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        st.push(A); // pusing root node

        while(!st.isEmpty()){

            TreeNode root=st.pop();
            
            list.add(root.val);
            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
        }
        return list;
    }
}
