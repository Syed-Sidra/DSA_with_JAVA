public class LCM {
    public static int gcd(int a,int b){
          return ((b == 0) ? a : gcd(b,a%b));
    }

    public static void lcm(int a, int b){
         int div = gcd(a,b);
         int res = (a * b) / div;
         System.out.println(res);
    }
    public static void main(String[] args) {
        int a = 16, b = 28;
        
        lcm(a, b);
    }
}

// Time Complexity -> O(log(min(a,b)))
