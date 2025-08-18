package arrays;

public class MultiplyMatrix {
    public static void multiplyMatrices(int[][] arr, int[][] brr){
        int n = arr.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                  res[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,5},{2,6}};
        int brr[][]={{2,7},{10,13}};
        multiplyMatrices(arr, brr);
    }
}
