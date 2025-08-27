/** place N Queens on an N * N chessboard such that no 2 queens can attack eachother 
 *   Questions related--
 *  Yes/No
 * all solution count solution
 */
package backtracking;

public class NQueen {
   public static void main(String[] args) {
        int n=4;
    char[][] chessBoard = new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            chessBoard[i][j] = 'X';
        }
    }
    printBoard(chessBoard);
    System.out.print("----------------------------");
    queenBoard(chessBoard,0);
   }

   //queen board
   public static void queenBoard(char[][] board, int row){
    if(row==board.length){
        printBoard(board);
        return;
    }
    for(int j=0;j<board.length;j++){
        if(isSafe(board, row, j)){
        board[row][j]='Q';
        queenBoard(board, row+1);
        board[row][j] = 'X';
        }
    }
    }

   

   // let's check is it safe to place the queen
   public static boolean isSafe(char[][] board,int row,int col){
     // vertical up
     for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q')
        return false;
     }
     // diagonal left up
     for(int j=row-1,k=col-j;j>=0 && k>=0;j--,k--){
      if(board[j][k]=='Q')
      return false;
     }
     // right diagonal up
     for(int l=row-1,m=col+1;l>=0 && m<board.length;l--,m++){
        if(board[l][m]=='Q')
        return false;
     }
     return true;
   }

   // print board
   public static void printBoard(char[][] board){
    System.out.println("---------CHESS BOARD------------");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" | ");
        }
        System.out.println();
    }
   }
}
