package arrays;

public class RotateSquare {
     public static int[][] rotateSquare(int arr[][]){
      int n = arr.length;
      for(int i=0;i<n/2;i++){
        for(int j=i;j<n-i-1;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][n-1-i];
            arr[j][n-1-i] = arr[n-1-i][n-1-j];
            arr[n-1-i][n-1-j]=arr[n-1-j][i];
            arr[n-1-j][i]=temp;
        }
      }
     return arr;
     }
     public static void printArr(int arr[][]){
        int n= arr.length;
         for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            System.out.print(arr[k][i]+" ");
        }
        System.err.println();
      }
     
     }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printArr(arr);
        System.out.println("------------------------");
        rotateSquare(arr);
        printArr(arr);
    }
}
