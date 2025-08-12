public class NQueensBacktracking {
    static int N;

    // Check if a queen can be placed safely
    static boolean isSafe(char[][] board, int row, int col) {
        // Check this column above
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    static void solve(char[][] board, int row) {
        if (row == N) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(board, row + 1);
                board[row][col] = '.';  // backtrack
            }
        }
    }

    static void printBoard(char[][] board) {
        System.out.println("Solution:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        N = 4;  // Change to 8 for 8-Queens
        char[][] board = new char[N][N];

        // Initialize board with empty cells
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = '.';

        solve(board, 0);
    }
}
