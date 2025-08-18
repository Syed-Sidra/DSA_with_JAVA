package arrays;

public class KadanesAlgo {
    public static void kadaneAlgo(int[] arr){
        int n= arr.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cs += arr[i];
            if(cs<0) cs =0;
            ms = Math.max(cs,ms);
        }
        System.out.print(ms);
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        kadaneAlgo(arr);
    }
}
