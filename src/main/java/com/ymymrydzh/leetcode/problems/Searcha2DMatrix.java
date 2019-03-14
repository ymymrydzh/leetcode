/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年2月15日 下午10:21:43
 * @description Write an efficient algorithm that searches for a value in an m x
 *              n matrix. This matrix has the following properties:
 * 
 *              Integers in each row are sorted from left to right.
 *              The first integer of each row is greater than the last integer
 *              of the previous row.
 *              For example,
 * 
 *              Consider the following matrix:
 * 
 *              [
 *               [1, 3, 5, 7],
 *               [10, 11, 16, 20],
 *               [23, 30, 34, 50]
 *              ]
 *              Given target = 3, return true.
 */
public class Searcha2DMatrix {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Searcha2DMatrix sm = new Searcha2DMatrix();
        int[][] matrix = new int[][]{};
        System.out.println(sm.searchMatrix(matrix, 8));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1) {
            return false;
        }
        int i = 0;
        int row = matrix.length - 1;
        int j = matrix[0].length - 1;
        while (i < row) {
            int p = (row + i) / 2;
            if (target == matrix[p][0]) {
                return true;
            } else if (target < matrix[p][0]) {
                row = p - 1;
            } else if (target > matrix[p][j]) {
                i = p + 1;
            } else {
                row = p;
                break;
            }
        }
        if (row < i) {
            return false;
        }
        i = 0;
        while (i <= j) {
            int p = (j + i) / 2;
            if (target == matrix[row][p]) {
                return true;
            } else if (target < matrix[row][p]) {
                j = p - 1;
            } else if (target > matrix[row][p]) {
                i = p + 1;
            }
        }
        return false;
    }
}
