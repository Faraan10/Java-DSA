package trees.binarySearchTrees;

public class SortedArrayToBalancedBST {

    public TreeNode sortedArrayToBST(final int[] A) {

        return buildBST(A, 0, A.length - 1);
    }

    public static TreeNode buildBST(int[] A, int start, int end) {
        // Base case: no elements
        if (start > end) {
            return null;
        }

        // Pick middle element as root
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(A[mid]);

        // Recursively build left and right subtrees
        root.left = buildBST(A, start, mid - 1);
        root.right = buildBST(A, mid + 1, end);

        return root;
    }
    
}
