package linkedlist;
public class RemoveFirst {
     public static Node head;
        public static Node tail;
    public static class Node{
       int data;
       Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
     //print
    public static void printll(){
    if(head == null){
        System.out.println("LinkedList is empty");
    }
    else{
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
                System.out.print( " null");
    
    }
    }
    // add first
    public void addFirst(int data){
        int size =0;
        if(head == null){
            head = tail = null;
            return;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        head = newNode;
    }
    // remove first
    public static int removeFirst(int size){
     if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
     }
     else if(size ==1){
        int val = head.data;
        head = tail = null;
        size =0;
        return val;
     }
     int val = head.data;
     head = head.next;
     size--;
     return val;
    }
    public static void main(String[] args){
        RemoveFirst ll = new RemoveFirst();
        ll.head = new Node(10);
        ll.head.next = new Node(20);
        ll.addFirst(5);
        ll.addFirst(2);
        
        printll();
        removeFirst(4);
        System.out.println();
        printll();
    }
}
