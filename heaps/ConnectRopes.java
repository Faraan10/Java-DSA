package heaps;

import java.util.PriorityQueue;


// Why do we use PriorityQueue in heap problems?
// Short answer:

// Because Java does NOT expose a Heap class — PriorityQueue is Java’s heap implementation.

// So when you solve heap problems in Java, you almost always use:
// PriorityQueue

// Heap vs PriorityQueue (Important distinction)
// 🔹 Heap (Data Structure)

// Conceptual DS

// Supports:

// insert

// extract min / max

// Always a complete binary tree

// Used when we need fast access to min or max

// 🔹 PriorityQueue (Java Class)

// Java’s implementation of heap

// Internally uses Binary Heap

// Provides:

// add() → heap insert

// peek() → min/max element

// remove() / poll() → extract

// 👉 So PriorityQueue = Heap in Java

public class ConnectRopes {
    
    // TC: O(N * log N)
    // SC: O(N)
    public int solve(int[] A) {

        int N=A.length;
        // priority queue by natural ordering gives back smallest element when
        // peeking element or when removing but the priority queue is not sorted 
        // we can write as below to get the smallest element first or 
        
        // Note:
        // PriorityQueue is NOT fully sorted like an array
        // It only guarantees:
        // Top element is correct (min or max depending on heap)
        // Rest of elements are NOT in sorted order
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // we can write explicitly to but it follows returing smallest 
        // PriorityQueue<Integer> pqex=new PriorityQueue<>((a,b)-> Integer.compare(a,b));

        // If we want to return the largest element first then we have to 
        // specify explictly 
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // or
        // PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> Integer.compare(b, a));
        for(int i=0; i<N; i++){
            pq.add(A[i]);
        }

        int sum=0;
        while(pq.size()>1){
            int rope1=pq.poll(); // poll is better than remove as it
            int rope2=pq.poll(); // will return null instead of exception
            sum+=rope1+rope2;
            pq.add(rope1+rope2);
        }
        return sum;
    }
}
