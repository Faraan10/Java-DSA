package trees.binaryTrees;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;


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


public class RightViewBinaryTree {
    
    // TC: O(N)
    // SC: O(N)
    public ArrayList<Integer> solve(TreeNode A){

        Queue<TreeNode> que=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        que.add(A); // adding first root node

        while(!que.isEmpty()){

            int size=que.size();
            TreeNode remove=null;

            for(int i=0; i<size; i++){
                
                remove=que.remove();
                if(remove.left != null){
                    que.add(remove.left);
                }
                if(remove.right != null){
                    que.add(remove.right);
                }
            }
            ans.add(remove.val);
        }
        return ans;
    }
}
