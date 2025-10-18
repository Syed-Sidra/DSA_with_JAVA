package linkedlist;
public class doubleLL{
     public static Node head;
        public static Node tail;
        public static int size;
     class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
       
    }

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = null;
        head = newNode;
        size++;
    }
    // remove 
    public int remove(){
     if(head == null){ 
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
     }
     if(size ==1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
     }
     int val = head.data;
     head = head.next;
     head.prev = null;
     size--;
     return val;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        doubleLL dll = new doubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.remove();
        dll.print();
    }
}