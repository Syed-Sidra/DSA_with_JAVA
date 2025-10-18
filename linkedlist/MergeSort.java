package linkedlist;

public class MergeSort {
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
    public static Node getMid(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public static Node mergeSort(Node head){
        // base condition
        if(head == null || head.next == null){
            return head;
        }
            Node mid = getMid();
            Node rightHead = mid.next;
            mid.next=null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }
    public static void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println(" null");
    }
    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.head = new Node(3);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(1);
        ll.head.next.next.next = new Node(5);
        ll.head.next.next.next.next = new Node(4);
        ll.tail = ll.head.next.next.next.next;
        printll();
        mergeSort(head);
        printll();

    }
}
