/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-14 13:51:27
 * @description We are playing the Guess Game. The game is as follows:
 * 
 *              I pick a number from 1 to n. You have to guess which number I
 *              picked.
 * 
 *              Every time you guess wrong, I'll tell you whether the number is
 *              higher or lower.
 * 
 *              You call a pre-defined API guess(int num) which returns 3
 *              possible results (-1, 1, or 0):
 * 
 *              <li>-1 : My number is lower
 *              <li>1 : My number is higher
 *              <li>0 : Congrats!
 * 
 *              You got it! Example :
 * 
 *              Input: n = 10, pick = 6 Output: 6
 */

public class GuessNumberHigherorLower {

	int myNumber;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GuessNumberHigherorLower g = new GuessNumberHigherorLower(1702766719);
		System.out.println(g.guessNumber(2126753390));
	}

	public GuessNumberHigherorLower(int myNumber) {
		this.myNumber = myNumber;
	}

	public int guessNumber(int n) {
		int low = 1;
		int high = n;
		int mid = (low + high) / 2;
		while (low < high) {
			if (guess(mid) == -1) {
				high = mid;
				mid = (low >> 1) + (high >> 1);
			} else if (guess(mid) == 1) {
				low = mid + 1;
				mid = (low >> 1) + (high >> 1);
			} else {
				return mid;
			}
		}
		return low;
	}

	/**
	 * The guess API is defined in the parent class GuessGame.
	 * 
	 * @param num,
	 *            your guess
	 * 
	 * @return -1 if my number is lower, 1 if my number is higher, otherwise
	 *         return 0 int guess(int num);
	 */
	int guess(int num) {
		if (myNumber < num) {
			return -1;
		} else if (myNumber > num) {
			return 1;
		} else {
			return 0;
		}
	}
}
