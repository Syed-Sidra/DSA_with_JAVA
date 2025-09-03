package linkedlist;

public class AddLast {
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

    // to add in last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // printing a linkedlist
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

    public static void main(String[] args){
      AddLast ll = new AddLast();
        ll.head = new Node(10);
        ll.tail = new Node(13);
        
        ll.addLast(32);
        
        printll();
    }
}
