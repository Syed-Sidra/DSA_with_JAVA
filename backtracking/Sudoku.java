package backtracking;

public class Sudoku {
    public static boolean sudokuSolver(int[][] sudoku,int row,int col){
        if(row==9 && col==0)
        return true;
        // recursion
        int nextRow = row, nextCol = col+1;
        if(col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col]!=0){
            return (sudokuSolver(sudoku, nextRow, nextCol));
        }
        else{
            for(int dig = 1;dig<=9;dig++){
                if(isSafe(sudoku,row,col,dig)){
                    sudoku[row][col] = dig;
                    if(sudokuSolver(sudoku, nextRow, nextCol)){
                        return true;
                    }
                    sudoku[row][col]=0;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] sudoku,int row, int col,int dig){
        // col
        for(int i =0;i<=8;i++){
            if(sudoku[i][col]==dig){
                return false;
            }
        }
        // row
        for(int i=0;i<=8;i++){
            if(sudoku[row][i]==dig){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc =(col/3)*3;
        for(int i = sr;i<sr+3;i++){
           for(int j = sc;j<sc+3;j++){
            if(sudoku[i][j]==dig)
            return false;
           } 
        }
        return true;
    }
    // print
    public static void printSudoku(int[][] sudoku){
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(sudoku[i][j]+" | ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args){
        int[][] sudoku = {
             { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
             { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
             { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
             { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
             { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
             { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
             { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
             { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
             { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
};
           sudokuSolver(sudoku, 0, 0);
           printSudoku(sudoku);
     }
}
