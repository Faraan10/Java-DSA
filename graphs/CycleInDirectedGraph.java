package graphs;

import java.util.ArrayList;

public class CycleInDirectedGraph {
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited, boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                if (dfs(neighbour, adj, visited, pathVisited))
                    return true;

            } else if (pathVisited[neighbour]) {

                return true;

            }
        }

        pathVisited[node] = false;

        return false;
    }

    public int solve(int A, int[][] B) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= A; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : B)
            adj.get(edge[0]).add(edge[1]);

        boolean[] visited = new boolean[A + 1];
        boolean[] pathVisited = new boolean[A + 1];

        for (int i = 1; i <= A; i++) {

            if (!visited[i]) {

                if (dfs(i, adj, visited, pathVisited))
                    return 1;
            }
        }

        return 0;
    }
}
