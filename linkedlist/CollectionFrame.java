package linkedlist;
import java.util.LinkedList;
public class CollectionFrame {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.print(ll);

        ll.removeLast();
                System.out.print(ll);

    }
}
