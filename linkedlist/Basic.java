package linkedlist;

public class Basic {
     public static class Node{
     int data;
     Node next;
     public Node(int data){
     this.data = data;
     this.next = null;
     }
 }

 public static Node head;
 public static Node tail;

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
    }
 }
    public static void main(String[] args){
    Basic ll = new Basic();
    ll.head = new Node(1);
    ll.head.next = new Node(2);
    printll();
    }
}

