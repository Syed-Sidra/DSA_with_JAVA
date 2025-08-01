// GCD or HCF

public class GCD {
   public int gcd(int a, int b){
    // 0 divides every number
        if(a == 0){
            return b;
        }

        if(b == 0){
            return a;
        }

        //base case
        if(a==b)
        return a;

        if(a>b){
            if(a%b==0){
                return b;
            }
            return gcd(a-b,b);
        }

        if(b%a ==0){
            return a;
        }
        
      return gcd(a,b-a);
    }

    public static void main(String[] args) {
        int a =20, b=28;
        GCD obj = new GCD();
        System.out.println(obj.gcd(a, b));

        optimizedGcd ob = new optimizedGcd();
        System.out.println(ob.gcdOpt(a, b));
    }
}

// Time Complexity -> O(min(a,b))

//Optimized solution (Eucledian method)

class optimizedGcd{
     public int gcdOpt(int a, int b){
        /* check any one value either a or b is zero or not. If any one of them is zero then it will return the opposite value
        if the condition is false then we perform modulo operation on the value which is given in the condition*/
        
        return ((b==0) ? a : gcdOpt(b, a%b));
     }
}

// Time complexity -> O(log(min(a,b)))
