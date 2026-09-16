import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Sol{
   public List<List<String>> solveNQueens(int n) {
     List<List<String>> sol = new ArrayList<>();
     int[] queenColumns = new int[n];
     backtrack(0, queenColumns, n, sol);

 return sol;
}

private static void backtrack(int row, int[] queenColumns, int n, List<List<String>> sol) {
  if(row == n){
    sol.add(constructBoard(queenColumns, n));
    return;
  }

  for(int col = 0; col < n; col++){
    if(isSafe(row, col, queenColumns)){
      queenColumns[row] = col;
      backtrack(row + 1, queenColumns, n, sol);
    }
  }
}

private static boolean isSafe(int row, int col, int[] queenColumns) {
for(int prevRow = 0; prevRow < row; prevRow++){
  int prevCol = queenColumns[prevRow];
  if(prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)){
    return false;
  }
}
  return true;
}


private static List<String> constructBoard(int[] queenColumns, int n){
 List<String> board = new ArrayList<>();
 char[] rowChars = new char[n];
 Arrays.fill(rowChars, '.');
 rowChars[queenColumns[0]] = 'Q';
 String rowString = new String(rowChars);
 board.add(rowString);
  return board;
}
public static void main(String[] args) {
    Sol s = new Sol();
    System.out.println(s.solveNQueens(4));
  }

}