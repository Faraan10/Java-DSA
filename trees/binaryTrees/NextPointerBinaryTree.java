package trees.binaryTrees;
import java.util.*;

class TreeLinkNode{

    int val;
    TreeLinkNode left;
    TreeLinkNode right;
    TreeLinkNode next;

    TreeLinkNode(int x){
        val=x;
        left=null;
        right=null;
        next=null;
    }
}

public class NextPointerBinaryTree {
    
    // TC: O(N) travelling through each node once 
    // SC: O(N) using queue for storing nodes
    public void solveNextPointer(TreeLinkNode root){

        if(root==null){
            return;
        }

        // here below I a using BFS approach using queue
        // as Queue is an Interface we have to to either LinkedList or Arraydeque

        Queue<TreeLinkNode> que=new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){

            int size=que.size();
            TreeLinkNode prev=null;

            for(int i=0; i<size; i++){
                
                TreeLinkNode curr=que.remove();

                if(prev != null){
                    prev.next=curr;
                }
                prev=curr;

                if(curr.left != null) que.add(curr.left);
                if(curr.right != null) que.add(curr.right);

            }
            prev.next=null;
        }
    }


    // optimized approach
    // TC: O(N)
    // SC: O(1)
    public void solve(TreeLinkNode root){

        TreeLinkNode head=root;

        while(head != null){
            TreeLinkNode nextHead=head.left;
            if(nextHead ==null){
                return;
            }
            while(head != null){
                head.left.next=head.right;
                if(head.next != null){
                    head.right.next=head.next.left;
                }
                head=head.next;
            }
            head=nextHead;
        }
            
    }
}
