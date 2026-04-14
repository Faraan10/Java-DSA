package revision;

public class CountNodes {
    
    class NodeOfTree{

        int val;
        NodeOfTree left;
        NodeOfTree right;

        NodeOfTree(int x){
            val=x;
            left=null;
            right=null;
        }
    }

    // TC: O(N)
    // SC: O(h) max height of tree
    public int NodeCount(NodeOfTree A){

        if(A==null){
            return 0;
        }
        return solve(A);
    }

    public int solve(NodeOfTree root){

        if(root==null){
            return 0;
        }
        
        int left=solve(root.left);
        int right=solve(root.right);
        return left+right+1;
    }





    // practise 
    // TC: O(N)
    // SC: O(H)
    public int nodeCount(NodeOfTree A){

        return count(A);
    }

    public int count(NodeOfTree root){

        if(root==null){
            return 0;
        }

        int left=count(root.left);
        int right=count(root.right);

        return left+right+1;
    }
}


