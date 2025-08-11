import java.util.ArrayList;
public class CeilAndFLoor {
    public static int ceil(int a, int b){
        int div = a/b;

        if((a^b)<0 && a/b != 0){
            div--;
        }
        return div;
    }
     public static int floor(int a, int b){
        int  div = a/b;

        if((a^b)>0 && a/b != 0){
            return div++;
        }
        return div;
    }
    public static ArrayList<Integer> ceilAndFloor(int a, int b){
         ArrayList<Integer> res = new ArrayList<>();

         res.add(ceil(a,b));
         res.add(floor(a,b));

         return res;
    }


    public static void main(String[] args) {
        int a = 13, b = 17;

        ArrayList<Integer> res = ceilAndFloor(a,b);
        System.out.print(res.get(0) + " " + res.get(1));
    }
}
