package backtracking;

public class basic {
    public static void changeArray(int[] arr, int i, int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
       // recursion
       arr[i] = val;
       changeArray(arr,i+1,val+1);
       arr[i] -= 2;
       printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int idx = 0; idx < arr.length; idx++) {
          System.out.print(arr[idx]+ " ");
        }
        System.out.println("");
    } 
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr,0,1);
    }
}
