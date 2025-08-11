public class ModularDivision {
    public static int modulo(int a, int b, int M){
        return ((a/b)%M);
    }

    public static void main(String[] args) {
        int a = 3;
        int b=3;
        int m=4;
        System.out.print(modulo(a, b, m));
    }
}
