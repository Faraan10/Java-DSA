package trees.binaryTrees;

public class LeastCommonAncestor {
    
    // TC: O(N)
    // SC: O(h)
    public int lca(TreeNode A, int B, int C) {

        TreeNode node = findLCA(A, B, C);

        // If one or both nodes are missing, return -1
        if (!exists(A, B) || !exists(A, C))
            return -1;

        return node == null ? -1 : node.val;
    }

    // Helper to find LCA recursively
    private TreeNode findLCA(TreeNode root, int B, int C) {
        if (root == null)
            return null;

        if (root.val == B || root.val == C)
            return root;

        TreeNode left = findLCA(root.left, B, C);
        TreeNode right = findLCA(root.right, B, C);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    // Helper to check if a value exists in the tree
    private boolean exists(TreeNode root, int val) {
        if (root == null)
            return false;
        if (root.val == val)
            return true;
        return exists(root.left, val) || exists(root.right, val);
    }
}
