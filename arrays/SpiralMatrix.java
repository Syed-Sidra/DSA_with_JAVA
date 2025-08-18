package arrays;

public class SpiralMatrix {
    public static void spiralTraverse(int arr[][]){
    int n= arr.length;
    int startRow =0;
    int endRow= n-1;
    int startCol = 0;
    int endCol = arr[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
    // top
    for(int i=startCol;i<=endCol;i++){
        System.err.print(arr[startRow][i] + " ");
    }
    

    //right
    for(int j=startRow+1;j<=endRow;j++){
        System.err.print(arr[endCol][j]+ " ");
    }
            

    //bottom
    for(int k=endCol-1;k>=startCol;k--){
        System.err.print(arr[k][endRow]+ " ");
    }
            

    //left
    for(int l=endRow-1;l>=startRow;l--){
        System.err.print(arr[l][startCol]+ " ");
    }
            

    startRow++;
    startCol++;
    endRow--;
    endCol--;
    }
    
    }
    
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        spiralTraverse(arr);
        
    }
}
