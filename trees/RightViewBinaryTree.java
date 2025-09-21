package trees;

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
    
    public ArrayList<Integer> solve(TreeNode A){

        Queue<TreeNode> que=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        que.add(A); // adding first root node
        TreeNode required=null;

        while(!que.isEmpty()){

            TreeNode remove=que.remove();
            
            int size=que.size();

            for(int i=0; i<size; i++){

                if(remove.left != null){
                    que.add(remove.left);
                }
                if(remove.right != null){
                    que.add(remove.right);
                }
                if(i == size-1){
                    required=remove;
                }
            }
            ans.add(required.val);
        }
        return ans;
    }
}
