package linkedlist;

public class ReverseLL {
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
     public static void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null ");
        return;
     }
    public static void reverse(){
       Node prev = null;
       Node  curr = head;
       Node next;

       while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       tail=head;
       head = prev;
    }
    public static void main(String args[]){
    ReverseLL ll = new ReverseLL();
    ll.head = new Node(1);
    ll.head.next = new Node(2);
    ll.head.next.next = new Node(3);
    ll.head.next.next.next = new Node(4);
    ll.head.next.next.next.next = new Node(5);
    ll.tail = ll.head.next.next.next.next;
    printll();
    reverse();
    System.out.println();
    printll();
    }

}
