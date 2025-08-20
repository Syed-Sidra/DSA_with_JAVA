package arrayLists;
import java.util.ArrayList;

public class multiArr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(10);
        mainList.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(24);
        mainList.add(list2);
        for(int i=0;i<mainList.size();i++){
            System.out.print(mainList.get(i)+" ");
        }
    }
}
