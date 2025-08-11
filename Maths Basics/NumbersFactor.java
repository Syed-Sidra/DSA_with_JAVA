
import java.util.ArrayList;

// factors like 
// 10 -> [1,2,5,10] 
public class NumbersFactor{
     public static ArrayList<Integer> NumberFactor(int n){
        ArrayList<Integer> div = new ArrayList<>();
        // taking square root of the number as 2 * 5 == 5 * 2 OR  1 * 10 ==  10 * 1 so we can print both the numbers at a time
            for(int i=1; i<= Math.sqrt(n);i++){
                // checks the number is the factor or not
                if(n % i == 0){
                  /*  if the number divisible and its quotient is == to i then we print only i
                   let's take an example of this situation
                   if i = 3 and n = 9 then the condition become
                   9/3 == 3 
                  */
                    if(n/i == i){
                        div.add(i);
                    }
                    else{
                        div.add(i);
                        div.add(n/i);
                    }
                }
            }
            return div;
     }
    public static void main(String[] args){
      int num = 10;
       ArrayList<Integer> arr = NumberFactor(num);
       for(int res : arr){
        System.out.print(res +" ");
       }
    }
}

// Time Complexity -> O(sqrt(n))

