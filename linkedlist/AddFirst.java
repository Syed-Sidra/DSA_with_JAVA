package linkedlist;

public class AddFirst {
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
   
      public void addMid(int idx,int data){
       if(idx==0){
        addFirst(data);
        return;
       }
       Node newNode = new Node(data);
       Node temp = head;
       int i=0;
       while(i<=idx-1){
        temp = temp.next;
        i++;
       }
       newNode.next = temp.next;
       temp.next=newNode;
    }
    public void addFirst(int data){
        if(head == null){
            head = tail = null;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        System.out.print("null");
    }
 }
 public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
        ll.head = new Node(1);
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
       ll.addMid(1,15);
        printll();
    }
}
