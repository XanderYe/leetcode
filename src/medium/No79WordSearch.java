package medium;

/**
 * Created on 2020/9/13.
 * @see <a href="https://leetcode-cn.com/problems/word-search/">79. 单词搜索</a>
 * @author 叶振东
 */
public class No79WordSearch {
    int m;
    int n;
    int[][] steps = new int[][]{
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean res = dfs(board, word, 0, i, j);
                    if (res) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int start, int x, int y) {
        if (word.charAt(start) != board[x][y]) {
            return false;
        } else if (start == word.length() - 1) {
            return true;
        }
        visited[x][y] = true;
        boolean res = false;
        for (int[] step : steps) {
            int newX = x + step[0];
            int newY = y + step[1];
            if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                if (!visited[newX][newY]) {
                    boolean flag = dfs(board, word, start + 1, newX, newY);
                    if (flag) {
                        res = true;
                        break;
                    }
                }
            }
        }
        visited[x][y] = false;
        return res;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(new No79WordSearch().exist(board, "ABCCED"));
        System.out.println(new No79WordSearch().exist(board, "SEE"));
        System.out.println(new No79WordSearch().exist(board, "ABCB"));
        board = new char[][]{
                {'a', 'b'},
                {'c', 'd'},
        };
        System.out.println(new No79WordSearch().exist(board, "acdb"));
    }
}
