import java.util.*;

public class NQueens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<String>> solutions = solveNQueens(n);

        if (solutions.isEmpty()) {
            System.out.println("No solution");
        } else {
            for (List<String> board : solutions) {
                for (String row : board) {
                    System.out.println(row);
                }
                System.out.println(); // separate different solutions
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        boolean[] cols = new boolean[n];         // columns occupied
        boolean[] diag1 = new boolean[2 * n];    // main diagonal
        boolean[] diag2 = new boolean[2 * n];    // anti-diagonal

        backtrack(0, board, cols, diag1, diag2, results);
        return results;
    }

    private static void backtrack(int row, char[][] board, boolean[] cols, boolean[] diag1, boolean[] diag2, List<List<String>> results) {
        int n = board.length;
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            results.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;
            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            backtrack(row + 1, board, cols, diag1, diag2, results);

            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
}
