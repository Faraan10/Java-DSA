package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumbersInWindow {
    
    // TC: O(N)
    // SC: O(B)
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

         ArrayList<Integer> result = new ArrayList<>();
        if (B > A.size()) return result; // edge case

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Process first window
        for (int i = 0; i < B; i++) {
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }

        result.add(map.size()); // first window count

        // Step 2: Slide the window
        for (int i = B; i < A.size(); i++) {
            int remove = A.get(i - B); // element going out
            int add = A.get(i);        // element coming in

            // Decrease count or remove completely
            if (map.get(remove) == 1) {
                map.remove(remove);
            } else {
                map.put(remove, map.get(remove) - 1);
            }

            // Add the new element
            map.put(add, map.getOrDefault(add, 0) + 1);

            result.add(map.size());
        }

        return result;
    }
}
