package doubleLinkedList;

import java.util.HashMap;

public class LRUCache {
    
    class Node{

        int key;
        int value;
        Node next;
        Node prev;

        Node(int x, int y){
            key=x;
            value=y;
            next=null;
            prev=null;
        }
    }

    Node head;
    Node tail;
    int size;
    HashMap<Integer, Node> hm;
    
    public LRUCache(int capacity) {

        size=capacity;
        hm=new HashMap<>();

        head=new Node(-1, -1);
        tail=new Node(-1, -1);

        head.next=tail;
        tail.prev=head;
        
    }

    public void insertBeforeTail(Node x){

        Node previous=tail.prev;

        previous.next=x;
        x.prev=previous;

        x.next=tail;
        tail.prev=x;
    }

    public void removeNode(Node x){

        Node previous=x.prev;
        Node next=x.next;

        previous.next=next;
        next.prev=previous;
    }
    
    public int get(int key) {
        
        if(!hm.containsKey(key)){
            return -1;
        }

        Node node=hm.get(key);
        removeNode(node);
        insertBeforeTail(node);
        return node.value;

    }
    
    public void set(int key, int value) {

        if(hm.containsKey(key)){

            Node node=hm.get(key);
            node.value=value;
            removeNode(node);
            insertBeforeTail(node);
        }else{

            if(size==hm.size()){

                Node node=head.next;
                removeNode(node);
                hm.remove(node.key);
            }
            Node newNode=new Node(key, value);
            insertBeforeTail(newNode);
            hm.put(key, newNode);
        }
        
    }
}
