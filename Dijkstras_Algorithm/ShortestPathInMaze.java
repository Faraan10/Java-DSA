package Dijkstras_Algorithm;
import java.util.PriorityQueue;
import java.util.Arrays;

public class ShortestPathInMaze {
    
    // TC: O(n * m * log(n*m))
    // SC: O(n * m)
    public int solve(int[][] A, int[] B, int[] C) {
        int n = A.length, m = A[0].length;

        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.offer(new int[]{0, B[0], B[1]});
        dist[B[0]][B[1]] = 0;

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], r = curr[1], c = curr[2];

            if (r == C[0] && c == C[1]) return d;

            if (d > dist[r][c]) continue;

            for (int[] dir : dirs) {
                int nr = r, nc = c, steps = 0;

                while (nr + dir[0] >= 0 && nr + dir[0] < n &&
                       nc + dir[1] >= 0 && nc + dir[1] < m &&
                       A[nr + dir[0]][nc + dir[1]] == 0) {
                    nr += dir[0];
                    nc += dir[1];
                    steps++;
                }

                if (dist[r][c] + steps < dist[nr][nc]) {
                    dist[nr][nc] = dist[r][c] + steps;
                    pq.offer(new int[]{dist[nr][nc], nr, nc});
                }
            }
        }

        return -1;
    }
}
