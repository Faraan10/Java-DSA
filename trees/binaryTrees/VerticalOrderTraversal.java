package trees.binaryTrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class VerticalOrderTraversal {
    
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (A == null) return ans;

        HashMap<TreeNode, Integer> vertLevel = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> v = new HashMap<>();

        q.add(A);
        vertLevel.put(A, 0);

        int minLevel = 0, maxLevel = 0;

        while (!q.isEmpty()) {
            TreeNode x = q.poll();
            int vLevel = vertLevel.get(x);

            // Add node value to the list for its vertical level
            v.putIfAbsent(vLevel, new ArrayList<>());
            v.get(vLevel).add(x.val);

            // Left child
            if (x.left != null) {
                q.add(x.left);
                vertLevel.put(x.left, vLevel - 1);
                minLevel = Math.min(minLevel, vLevel - 1);
            }

            // Right child
            if (x.right != null) {
                q.add(x.right);
                vertLevel.put(x.right, vLevel + 1);
                maxLevel = Math.max(maxLevel, vLevel + 1);
            }
        }

        // Build the final ordered list
        for (int i = minLevel; i <= maxLevel; i++) {
            ans.add(v.get(i));
        }

        return ans;
    }
}
