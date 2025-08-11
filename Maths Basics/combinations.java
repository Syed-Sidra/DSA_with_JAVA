public class combinations {
    public static int factorial(int num){
       if(num == 1){
        return 1;
       }
       else
       return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        int n = 2;
        int r =4;
        int nr = factorial(n);
        int dr = factorial(r) * factorial(n-r);
        System.out.print(nr/dr);
    }
}
