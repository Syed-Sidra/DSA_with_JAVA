package linkedlist;

public class RemoveLast {
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
    // print
    public static void printll(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = head.next;
        }
        System.out.print(" null ");
    }
    // remove last
    public static int removeLast(int size){
     if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
     }
     else if(size==1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
     }
     Node prev = head;
     for(int i=0;i<size-2;i++){
        prev = prev.next;
     }
     int val = prev.next.data;
     prev.next = null;
     tail = prev;
     size--;
     return val;
    }
    public static void main(String[] args) {
        RemoveLast ll = new RemoveLast();
        ll.head = new Node(10);
        ll.head.next = new Node(20);
        printll();
        removeLast(2);
        System.out.println("");
        printll();
      
    }
}
