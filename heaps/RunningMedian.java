package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
    
    // TC: O(N log N) traversing till N and the operations such as 
    // .add happens once or twice in loop which has log N complexity
    // so overall O(N * log N)
    
    // SC: O(N) taking 2 heaps
    public int[] solve(int[] A) {

        int N=A.length;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); // gives largest from left side
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(); // gives smallest from right side
        int[] arr=new int[N];

        for(int i=0; i<N; i++){

            if(maxHeap.isEmpty() || A[i]<=maxHeap.peek()){
                maxHeap.add(A[i]);
            }else{
                minHeap.add(A[i]);
            }

            if(maxHeap.size()>minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }else if(minHeap.size()>maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }

            arr[i]=maxHeap.peek();
        }
        return arr;
    }
}
