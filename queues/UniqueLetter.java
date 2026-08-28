package queues;

import java.util.LinkedList;
import java.util.Queue;

public class UniqueLetter {
    
    // TC: O(N)
    // SC: O(N)
    public String solve(String A) {

        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        StringBuilder ans = new StringBuilder();

        for (char ch : A.toCharArray()) {
            freq[ch - 'a']++;
            q.offer(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }

        return ans.toString();
    }
}
