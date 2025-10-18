package linkedlist;

public class zigZag {
    public static Node head;
    public static Node tail;
    class Node{
        int data;
        Node next;
        public Node(int data){
        this.data = data;
        this.next = null;
        }
    }
    public void addFirst(int data){
     Node newNode = new Node(data);
     if(head == null){
        head = tail = newNode;
        return;
     }
     newNode.next = head;
     head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }

    public void printLL(){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(" null");
        }
    }

    public void zigzag(){
       //mid
       Node slow = head;
       Node fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

       }
       Node mid = slow;

           //reverse 2nd half

    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL,nextR;

    //alternate zigzog 

    while(left != null && right != null){
        nextL= left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }

    }
    
    public static void main(String[] args) {
       zigZag ll = new zigZag();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       ll.printLL();
       ll.zigzag();
       ll.printLL(); 
    }
}
