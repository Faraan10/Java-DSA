package revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class RightViewBinaryTree {
    
    // TC: O(N)
    // SC: O(N) as we used queue this is a BFS approach breadth first search
    public ArrayList<Integer> solve(TreeNode A) {
        
        ArrayList<Integer> list=new ArrayList<>();
        if(A==null){
            return list;
        }
        Queue<TreeNode> que=new LinkedList<>();
        TreeNode root=A;
        que.add(root);

        while(!que.isEmpty()){

            int size=que.size();
            for(int i=0; i<size; i++){
                
                TreeNode remove=que.remove();
                if(i==size-1){
                    list.add(remove.val);
                }

                if(remove.left != null){
                    que.add(remove.left);
                }
                if(remove.right != null){
                    que.add(remove.right);
                }
            }
        }
        return list;
    }
}
