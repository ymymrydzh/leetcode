/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-03 17:07:59
 * @description Count the number of prime numbers less than a non-negative
 *              number, n.
 * 
 *              Example:
 * 
 *              Input: 10 Output: 4 Explanation: There are 4 prime numbers less
 *              than 10, they are 2, 3, 5, 7.
 */
public class CountPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountPrimes c = new CountPrimes();
		System.out.println(c.countPrimes(10));
		c.isPrime(0);
	}

	public int countPrimes(int n) {
		// int count = 0;
		// for (int i = 2; i < n; i++) {
		// if (isPrime(i)) {
		// count++;
		// }
		// }
		// return count;

		// boolean[] nums = new boolean[n];
		// int count = 1;
		// for (int i = 3; i < n; i += 2) {
		// if (!nums[i]) {
		// count++;
		// int ii = 2 * i;
		// for (int j = i * 3; j < n; j += ii) {
		// nums[j] = true;
		// }
		// }
		// }
		// return n < 3 ? 0 : count;

		// 优化 根号n后边的，乘以小于根号n的倍数，在前半边已经乘过了，后边的乘积大于n，所以不用乘以倍数。
		boolean[] nums = new boolean[n];
		int count = n / 2;
		for (int i = 3; i * i < n; i += 2) {
			if (nums[i]) {
				continue;
			}
			int ii = 2 * i;
			for (int j = i * i; j < n; j += ii) {
				if (!nums[j]) {
					--count;
					nums[j] = true;
				}
			}
		}
		return n < 3 ? 0 : count;
	}

	private boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
