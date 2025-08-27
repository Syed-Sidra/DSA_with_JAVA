package backtracking;
// print 1 solution if exists..
public class NQueenPrint1Sol {
    public static void main(String[] args){
        int n=2;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        printBoard(board);
        if(queenBoard(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }
    public static boolean queenBoard(char[][] board,int row){
        int count =0;
        // base case
        if(row==board.length){
            count++;
            return true;
        }
        // column loop
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
             board[row][i] = 'Q';
            if(queenBoard(board, row+1)){
                return true;
            }
            board[row][i] = 'X';
            }
        }
        return false;
    }
    // placing queen is safe
    public static boolean isSafe(char[][] board,int row,int col){
        //vertical ip
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
            return false;
        }
        // diagonal vertical up
        for(int i=row-1,j=col-i;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')
            return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q')
             return false;
        }
        return true;
    }
    public static void printBoard(char[][] board){
        System.out.println("-----------CHESS BOARD-------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println("");
        }
    }
}
