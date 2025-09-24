package trees.binaryTrees;

public class EqualTreePartition {
    
    boolean found = false;
    long totalSum = 0;
    TreeNode root;

    // TC: O(H)
    // SC: O(H)
    public int solve(TreeNode A) {
        root = A;

        // Step 1: compute total sum
        totalSum = getSum(A);

        // If odd, cannot partition
        if (totalSum % 2 != 0) return 0;

        // Step 2: DFS to check for half sum
        check(A);

        return found ? 1 : 0;
    }

    // Compute subtree sum
    private long check(TreeNode node) {
        if (node == null) return 0;

        long left = check(node.left);
        long right = check(node.right);

        long sum = node.val + left + right;

        // If sum equals half of total and not the whole tree
        if (sum == totalSum / 2 && node != root) {
            found = true;
        }

        return sum;
    }

    // Simple DFS to calculate total sum
    private long getSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getSum(node.left) + getSum(node.right);
    }
}
