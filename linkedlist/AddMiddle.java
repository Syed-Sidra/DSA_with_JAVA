package linkedlist;

public class AddMiddle {
    public static Node head;
    public static Node tail;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        if(head == null){
            head = tail = null;
            return;
        }
        Node newNode = new Node(data);
        head.next = newNode;
        head = newNode;
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
    //print
    public static void printll(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
         ll.head = new Node(23);
         ll.head.next = new Node(24);
         ll.addFirst(26);
         ll.addMid(1,25);
         printll();
    }
}
