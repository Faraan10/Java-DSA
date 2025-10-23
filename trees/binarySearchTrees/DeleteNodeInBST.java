package trees.binarySearchTrees;

public class DeleteNodeInBST {
    
    // TC: O(log N)
    // SC: O(N)
    public TreeNode solve(TreeNode A, int B) {

        return deleteNode(A, B);
    }

    private TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        // Step 1: Search for the node
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found - handle 3 cases

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                // Find inorder predecessor (max in left subtree)
                TreeNode predecessor = findMax(root.left);
                root.val = predecessor.val;
                // Delete the predecessor node from left subtree
                root.left = deleteNode(root.left, predecessor.val);
            }
        }

        return root;
    }

    private TreeNode findMax(TreeNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }
}
