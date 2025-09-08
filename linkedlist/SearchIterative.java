package linkedlist;

public class SearchIterative {
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
    public static void printll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
    public static int searchElement(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
       return -1; 
    }
    public static void main(String[] args) {
        SearchIterative ll = new SearchIterative();
         ll.head = new Node(10);
         ll.head.next = new Node(20);
         ll.head.next.next = new Node(30);
         printll();
         System.out.println(searchElement(40));
    }
}
