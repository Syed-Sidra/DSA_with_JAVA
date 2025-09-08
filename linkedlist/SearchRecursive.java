package linkedlist;

public class SearchRecursive {
    public static Node head;
    public static Node tail;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
         this.data=data;
         this.next=null;
        }
    }
    public static void printll(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");

    }
    public static int searchRec(int key){
         return helper(head,key);
    }
    public static int helper(Node head,int key){
       if(head == null)
       return -1;

       if(head.data == key)
       return 0;

       int idx = helper(head.next, key);
       if(idx==-1)
       return -1;

       return idx+1;
    }
    public static void main(String[] args) {
        SearchRecursive ll = new SearchRecursive();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        printll();
        System.out.println(searchRec(2));

    }
}
