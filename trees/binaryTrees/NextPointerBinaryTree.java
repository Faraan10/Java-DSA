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
    
    public void solveNextPointer(TreeLinkNode root){

        // here below I a using BFS approach using queue
        // as Queue is an Interface we have to to either LinkedList or Arraydeque

        Queue<TreeLinkNode> que=new LinkedList<>();

        
    }
}
