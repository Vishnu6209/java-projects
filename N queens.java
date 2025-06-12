import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(res, board, 0);
        return res;
    }

    private static void backtrack(List<List<String>> res, char[][] board, int row) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) solution.add(new String(r));
            res.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(res, board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
