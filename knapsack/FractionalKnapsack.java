package knapsack;

import java.util.Arrays;

public class FractionalKnapsack {
    
    // TC: O(N log N)
    // SC: O(N)
    class Item {
        int value;
        int weight;
        double ratio;

        Item(int v, int w) {
            value = v;
            weight = w;
            ratio = (double)v / w;
        }
    }

    public int solve(int[] A, int[] B, int C) {

        int N = A.length;

        Item[] items = new Item[N];

        for (int i = 0; i < N; i++) {
            items[i] = new Item(A[i], B[i]);
        }

        Arrays.sort(items,
            (a, b) -> Double.compare(b.ratio, a.ratio));

        double ans = 0;

        for (Item item : items) {

            if (C >= item.weight) {

                ans += item.value;
                C -= item.weight;
            }
            else {

                ans += item.ratio * C;
                break;
            }
        }

        return (int)(ans * 100 + 1e-7);
    }
}
