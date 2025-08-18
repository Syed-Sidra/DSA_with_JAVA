package arrays;

public class SearchMatrix {
    public static boolean stairCaseSearch(int[][] arr, int key){
        int n =arr.length;
        int row=0, col= n-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
             System.out.println("key " + key+ " found at index (" + row + "," +col +")");
             return true;
            }
            else if(arr[row][col]>key){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.err.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
    {15,25,35,45},
    {27,29,37,48},
    {32,33,39,50}};
int key = 29;
System.out.println(stairCaseSearch(arr, key));
    }
}
