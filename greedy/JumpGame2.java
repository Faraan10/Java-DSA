import java.util.ArrayList;

public class JumpGame2 {
    
    public int solve(ArrayList<Integer> A) {

        int n = A.size();

        if (n == 1)
            return 0;

        if (A.get(0) == 0)
            return -1;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {

            farthest = Math.max(farthest, i + A.get(i));

            if (i == currentEnd) {

                if (farthest == i)
                    return -1;

                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1)
                    return jumps;
            }
        }

        return -1;
    }
}
