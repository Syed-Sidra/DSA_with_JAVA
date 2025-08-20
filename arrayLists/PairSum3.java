package arrayLists;
import java.util.ArrayList;

public class PairSum3 {
    public static boolean pairSum3(ArrayList<Integer> list,int target){
        int pivot = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int n= list.size();
        int lp=pivot+1;
        int rp=pivot;
       
        while(lp!=rp){
        int sum = list.get(rp) + list.get(lp);
        if(sum == target){
            return true;
        }
        else if(sum < target){
            lp = (lp+1)%n;
        }
        else{
            rp = (n+rp-1)%n;
        }
    }
        return false;
    }
    public static void main(String args[]){
           ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 19;
       System.out.println(pairSum3(list, target));
    }
}
