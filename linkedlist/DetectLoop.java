// Floyd's detection algorithm
package linkedlist;

public class DetectLoop {
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
   public static boolean isCycle(){
    Node slow = head;
    Node fast = head;

    while(fast.next!=null && fast!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow==fast){
            return true;
        }

    }
    return false;
   }
   public static void main(String[] args) {
       DetectLoop ll = new DetectLoop();
       ll.head=new Node(10);
       ll.head.next=new Node(20);
       ll.head.next.next=new Node(30);
       ll.head.next.next.next=new Node(40);
       ll.head.next.next.next.next=new Node(50);
       ll.tail = ll.head.next.next.next.next;
       ll.tail.next = ll.head;
       System.out.println(isCycle());

   }

}
