package arrayLists;

import java.util.ArrayList;

public class Swap {
    public static ArrayList<Integer> swap(ArrayList<Integer> list,int i1,int i2){
        int temp = list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
        return list;
    }
    public static void main(String[] args){
        int idx1 = 2;
        int idx2 = 4;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        swap(list,idx1,idx2);
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
