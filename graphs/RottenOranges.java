package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    
    public int solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        // Put all rotten oranges into queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (A[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }

                if (A[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0)
            return 0;

        int[][] dir = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        int minutes = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            boolean changed = false;

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for (int[] d : dir) {

                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < n &&
                        nc >= 0 && nc < m &&
                        A[nr][nc] == 1) {

                        A[nr][nc] = 2;
                        fresh--;
                        changed = true;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            if (changed)
                minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
