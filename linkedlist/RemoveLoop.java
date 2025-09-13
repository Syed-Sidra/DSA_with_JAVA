package linkedlist;

public class RemoveLoop {
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
    public static void removeCycle(){
    Node slow=head;
    Node fast=head;
    boolean exists = false;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow){
            exists = true;
            System.out.println("Loop is detected...");
            break;
        }
    }
    if(exists==false){
        return;
    }
    slow = head;
    Node prev = null;
    while(slow!=fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = null;
    }
    public static void printll(){
        Node prev = head;
        while(prev!=null){
            System.out.print(prev.data +" -> ");
            prev = prev.next;
        }
        System.out.println(" null");
    }
    public static void main(String[] args) {
        RemoveLoop ll = new RemoveLoop();
        ll.head = new Node(10);
        ll.head.next = new Node(20);
        ll.head.next.next = new Node(30);
        ll.head.next.next.next = new Node(40);
        ll.head.next.next.next.next = new Node(50);
        ll.tail = ll.head.next.next.next.next;
        ll.tail.next = ll.head.next.next; 
        
        removeCycle();
        printll();
    }
}
