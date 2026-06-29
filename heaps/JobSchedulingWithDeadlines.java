package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class JobSchedulingWithDeadlines {
    
    // This below is a greedy approach using the min heap
    // this problem also called as Flipkart's Challenge in 
    // Effective Inventory Management

    // TC: O(N log N)
    // SC: O(N)
    public int solve(int[] A, int[] B) {
        
        int N=A.length;
        int mod=1000000007;
        int[][] arr=new int[N][2];

        for(int i=0; i<N; i++){
            arr[i][0]=A[i];
            arr[i][1]=B[i];
        }
        Arrays.sort(arr, (x, y) -> Integer.compare(x[0], y[0]));

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long profit=0;
        int time=0;
        for(int i=0; i<N; i++){
            if(arr[i][0]>time){
                profit=profit+arr[i][1];
                pq.add(arr[i][1]);
                time++;
            }else if(arr[i][1]>pq.peek()){
                profit=profit+arr[i][1];
                profit=profit-pq.poll();
                pq.add(arr[i][1]);
            }
        }
        return (int)(profit%mod);
    }


    // problem can also be done like this with own class 
    class Item{

        int expiry;
        int profit;
        Item(int expiry, int profit){
            this.expiry=expiry;
            this.profit=profit;
        }
    }

    public Item[] buildAndSort(int[] A, int[] B){

        int N=A.length;
        Item[] items=new Item[N];
        for(int i=0; i<N; i++){
            items[i]=new Item(A[i], B[i]);
        }
        Arrays.sort(items, (x,y)-> Integer.compare(x.expiry, y.expiry));
        return items;
    }

    public int diffSolve(int[] A, int[] B) {

        Item[] items=buildAndSort(A, B);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long profit=0;
        int time=0;
        for(Item item: items){
            if(item.expiry > time){
                pq.add(item.profit);
                profit=profit+item.profit;
                time++;
            }else if(item.profit > pq.peek()){
                profit=profit+item.profit;
                profit=profit-pq.poll();
                pq.add(item.profit);
            }
        }
        return (int)(profit % 1000000007L);
    }
}
