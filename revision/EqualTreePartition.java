package revision;

import java.util.HashSet;

public class EqualTreePartition {

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
    
    HashSet<Long> set=new HashSet<>();
    public int solve(TreeNode A) {

        long total=sum(A);

        set.remove(total);

        if(total % 2 != 0){
            return 0;
        }

        if(set.contains(total/2)){
            return 1;
        }
        return 0;
    }

    public long sum(TreeNode root){

        if(root==null){
            return 0;
        }

        long left=sum(root.left);
        long right=sum(root.right);

        long current=left+right+root.val;
        set.add(current);

        return current;
    }
}
