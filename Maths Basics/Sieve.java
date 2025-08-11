public class Sieve {
    public static  int[] seive(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i] = true;
        }

        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                for(int i =p*p;i<=n;i+=p){
                    prime[i] = false;
                }
            }
        }

        int count =0;
        for(int i =2;i<=n;i++){
            if(prime[i]){
                count++;
            }
        }

        int[] res = new int[count];
        int idx =0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
             res[idx++] = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int num = 10;
        int[] pr = seive(num);
        for(int ans : pr){
            System.out.print(ans + " ");
        }
    }
}
