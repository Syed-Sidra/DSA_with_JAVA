public class ModularMultiplication {
    public static int modulo(int a, int b, int M){
        return (((a%M)*(b%M)) % M);
    }

    public static void main(String[] args) {
        int a = 5;
        int b= 3;
        int M =11;
        System.out.println(modulo(a, b, M));
    }
}
