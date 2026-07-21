package graphs;

import java.util.Arrays;

public class CommutableIslands {
    
    class DSU {
        int[] parent;
        int[] rank;

        DSU(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);

            if (px == py)
                return;

            if (rank[px] < rank[py]) {
                parent[px] = py;
            } else if (rank[px] > rank[py]) {
                parent[py] = px;
            } else {
                parent[py] = px;
                rank[px]++;
            }
        }
    }
    
    public int solve(int A, int[][] B) {

        Arrays.sort(B, (a, b) -> a[2] - b[2]);

        DSU dsu = new DSU(A);

        int ans = 0;

        for (int[] edge : B) {

            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dsu.find(u) != dsu.find(v)) {
                dsu.union(u, v);
                ans += w;
            }
        }

        return ans;
    }
}
