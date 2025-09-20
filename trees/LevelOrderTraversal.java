package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

    /**
 * Definition for binary tree **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;  
    
    // constructor
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
    }
}
 

public class LevelOrderTraversal {
    
    // TC: O(A)
    // SC: O(A)
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {

        Queue<TreeNode> que=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        que.add(A);

        while(!que.isEmpty()){
            ArrayList<Integer> list=new ArrayList<Integer>();

            int size=que.size();
            for(int i=0; i<size; i++){
                TreeNode remove=que.remove();

                if(remove.left != null){
                    que.add(remove.left);
                }
                if(remove.right != null){
                    que.add(remove.right);
                }
                list.add(remove.val);
            }
            ans.add(list);
        }
        return ans;
    }
}

