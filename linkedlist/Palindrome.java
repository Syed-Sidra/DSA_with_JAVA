package linkedlist;

public class Palindrome {
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
    // finding mid
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //step 2 reverse the right half
    public static boolean palindrome(){
        if(head == null || head.next==null){
            return true;
        }
        Node mid =findMid(head);
        Node curr = mid;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        Node ryt = prev;
        Node left = head;
        while(ryt !=null){
            if(left.data != ryt.data){
                return false;
            }
            left = left.next;
            ryt = ryt.next;
        }
        return true;
    }
    public static void printll(){
        Node temp = head;
        while(temp != null){
           System.out.print(temp.data +" -> ");
           temp = temp.next;
        }
        System.out.println(" null ");
    }
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.head = new Node(1);
    ll.head.next = new Node(2);
    ll.head.next.next = new Node(3);
    ll.head.next.next.next = new Node(2);
    ll.head.next.next.next.next = new Node(1);
    ll.tail = ll.head.next.next.next.next;
    printll();
    System.out.println(palindrome());
    
    }
}
