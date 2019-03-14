/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月22日 下午11:03:18
 * @description Determine if a Sudoku is valid, according to: Sudoku Puzzles -
 *              The Rules.
 * 
 *              The Sudoku board could be partially filled, where empty cells
 *              are filled with the character '.'.
 * 
 * 
 *              A partially filled sudoku which is valid.
 * 
 *              Note: A valid Sudoku board (partially filled) is not necessarily
 *              solvable. Only the filled cells need to be validated.
 */
public class ValidSudoku {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        boolean[][][] occur = new boolean[3][9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int cur = board[i][j] - '1';
                    if (occur[0][i][cur]) {
                        return false;
                    } else {
                        occur[0][i][cur] = true;
                    }
                    if (occur[1][j][cur]) {
                        return false;
                    } else {
                        occur[1][j][cur] = true;
                    }
                    if (occur[2][i / 3 * 3 + j / 3][cur]) {
                        return false;
                    } else {
                        occur[2][i / 3 * 3 + j / 3][cur] = true;
                    }
                }
            }
        }
        return true;
    }

}
