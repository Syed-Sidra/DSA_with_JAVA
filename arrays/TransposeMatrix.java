package arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
      int[][] ans=  transpose(arr);
      for(int[] res : ans){
            for(int ele : res){
                System.out.print(ele + " ");
            }
            System.out.println();
      }
    }
}
