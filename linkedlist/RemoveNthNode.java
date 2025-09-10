package linkedlist;

public class RemoveNthNode {
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
        System.out.println(" null");
    }
    public static void removeFromEnd(int n){
      int sz =0;
    
      Node temp = head;
      while(temp!=null){
        temp=temp.next;
        sz++;
      }
      if(n==sz){
        head=head.next;
        return;
      }
      int i=1;
      int iToFind = sz-n;
      Node prev = head;
      while(i<iToFind){
        prev = prev.next;
        i++;
      }
      prev.next = prev.next.next;
      return;

    }
     public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode();
       ll.head = new Node(1);
    ll.head.next = new Node(2);
    ll.head.next.next = new Node(3);
    ll.head.next.next.next = new Node(4);
    ll.head.next.next.next.next = new Node(5);
    ll.tail = ll.head.next.next.next.next;
    printll();
    removeFromEnd(1);
    System.out.println();
    printll();
     }

}
