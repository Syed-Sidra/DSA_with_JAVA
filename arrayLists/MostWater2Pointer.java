package arrayLists;
import java.util.ArrayList;
public class MostWater2Pointer {
    public static int mostWater(ArrayList<Integer> list){
        int n = list.size();
        int max = 0;
        int lp=0;
        int rp=n-1;
        while(rp>lp){
            int wdt = rp-lp;
            int ht = Math.min(list.get(rp),list.get(lp));
            int area = ht*wdt;
            max = Math.max(area,max);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(mostWater(list));
    }
}
