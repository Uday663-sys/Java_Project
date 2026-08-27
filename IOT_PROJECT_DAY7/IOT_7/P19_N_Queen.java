package IOT_7;
public class P19_N_Queen {
	static int N = 4;
    static int[][] board = new int[N][N];
    static boolean isSafe(int row, int col) {
	for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
	for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
	for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;
	return true;
    }
    static boolean solve(int col) {
    	if (col == N)
            return true;
    	for (int row = 0; row < N; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solve(col + 1))
                    return true;

                board[row][col] = 0; 
            }
        }
        return false;
    }
    public static void main(String[] args) {
    	if (solve(0)) {
            System.out.println("4-Queen Solution:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(board[i][j] + " * ");
                System.out.println();
            }
        } else {
            System.out.println("No Solution");
        }
    }
}