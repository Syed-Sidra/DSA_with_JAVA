package linkedlist;

public class AddFirst {
     public static Node head;
    public static Node tail;
    public static int size;
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
       size++;
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
          Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
      
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
        System.out.println("null");
    }
 }
 public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(3);
       ll.addLast(4);

        printll();
        System.out.println(size);
    }
}
